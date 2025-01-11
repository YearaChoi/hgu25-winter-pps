//https://www.acmicpc.net/problem/2010

// N개의 멀티탭 개수 주어짐
// 반복문 돌면서 꽃을 수 있는 수 -> 마지막은 -1 제외

import java.util.*;
public class A021_YearaChoi_20250111 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int sum = 0;
        for(int i=0; i<N; i++){
            int fn = sc.nextInt();
            sum += fn-1;
        }
        System.out.println(sum+1);
    }
}