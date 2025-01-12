//https://www.acmicpc.net/problem/1157

//대문자로 출력의 문제이기에 편리를 위해 입력값도 모두 대문자로 변환
//        -> String.toUpperCase(); 모두 대문자로 변경, 소문자는 String.toLowerCase();
//
//        알파벳 'A ~ Z'는 총 26개
//        -> int[] count = new int[26], 26크기의 배열 선언
//
//        입력 문자열 길이만큼 반복문 실행
//        -> 입력 문자열 한 글자씩, 해당 알파벳 순서의 int배열 count 값 증가
//        -> 'A'일 경우
//        ex) 'A'-'A' => 65-65 => 0으로 count배열 0번째 값 증가
//
//        알파벳 개수(배열크기)만큼 반복문 실행
//        -> 가장 중복값이 큰지 비교하며 max에 저장
//        -> 해당 위치 알파벳 알아내기 위해 (index + 'A')
//        ex) 1+'A' => 1+65 => 66, 66은 'B'에 해당

import java.util.*;

public class A045_YearaChoi_20250112 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toUpperCase();

        int[] count = new int[26];

        for (int i = 0; i < str.length(); i++) {
            int num = str.charAt(i) -'A' ;
            count[num]++;
        }

        int max = 0;
        char answer = '?';
        for (int i = 0; i < count.length; i++) {
            if(max < count[i]){
                max = count[i];
                answer = (char)(i+'A');
            } else if (max == count[i]){
                answer = '?';
            }
        }
        System.out.println(answer);
    }
}