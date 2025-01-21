//https://www.acmicpc.net/problem/5585
import java.io.*;
import java.util.*;
public class A110_YearaChoi_20250121 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cost = 1000 - Integer.parseInt(br.readLine());
        int[] coinArr = {500, 100, 50, 10, 5, 1};

        int num = 0;
        for(int i = 0; i < coinArr.length; i++){
            // 현재 동전으로 거슬러 줄 수 있는 동전의 개수를 확인
            if(cost/coinArr[i]>0){
                // 동전 개수 추가
                num += cost/coinArr[i];
                // 해당 동전으로 거슬러 준 후 남은 금액 계산
                cost = cost%coinArr[i];
            }
        }
        System.out.println(num);
    }
}