//https://www.acmicpc.net/problem/1292
import java.io.*;
import java.util.*;

public class A107_YearaChoi_20250121 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int cnt = 0; // 반복횟수 체크
        int result = 0;

        for(int i=1; i<=b; i++){ // i는 숫자 b까지 반복
            for(int j=1; j<=i; j++){ // j는 i번만큼 반복
                cnt++;
                if(a<=cnt && cnt<=b){ // 반복횟수가 a와 b사이라면
                    result += i; // i의 누적합을 구한다
                }
            }
        }
        System.out.println(result);
    }
}