//https://www.acmicpc.net/problem/1267

// 통화시간 n
// n번만큼 돌며 시간 입력받아 각각 요금 계산하기
// 총 요금 비교해서 저렴한 요금제 출력
// 이때 동일할 경우 두 이름 모두 출력

import java.util.*;
public class A022_YearaChoi_20250111 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int Y = 0;
        int M = 0;
        for(int i=0; i<T; i++){
            int t = sc.nextInt();
            Y += (t / 30 + 1) * 10;
            M += (t / 60 + 1) * 15;
        }
        if(Y == M){
            System.out.println("Y M " + Y);
        } else if (Y > M) {
            System.out.println("M " + M);
        }else if (Y < M) {
            System.out.println("Y " + Y);
        }
    }
}