//https://www.acmicpc.net/problem/1475
import java.util.*;
import java.io.*;

public class A017_YearaChoi_20250111 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String N = br.readLine();
        int arr[] = new int[10];

        // 문자를 숫자로 변환
        for(char c : N.toCharArray()){
            int num = c - '0';

            if (num == 9)
                num = 6;

            arr[num]++;
        }
        // 6과 9의 개수를 합쳐서 필요한 세트 수 계산
        arr[6] = (arr[6] / 2) + (arr[6] % 2);

        // 배열을 정렬하여 가장 큰 값을 마지막 요소로 이동
        Arrays.sort(arr);
        System.out.println(arr[9]);
    }
}