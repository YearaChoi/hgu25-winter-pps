//https://www.acmicpc.net/problem/2693
import java.io.*;
import java.util.*;
public class A081_YearaChoi_20250118 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer[] arr = new Integer[10];
        int N = Integer.parseInt(br.readLine());

        for(int i=0; i<N; i++){
            String[] str = br.readLine().split(" ");
            for(int j=0; j<10; j++){
                arr[j] = Integer.parseInt(str[j]);
            }

            Arrays.sort(arr, Collections.reverseOrder()); // 내림차순

            int result = arr[2];

            System.out.println(result);
        }
    }
}