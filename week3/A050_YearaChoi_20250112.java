//https://www.acmicpc.net/problem/5598
//대문자 알파벳의 아스키코드값은 65 ~ 90.
//문제에서 3개씩 건너뛰어 적었으므로, -3씩 해주는데, 알파벳 A, B, C 만 신경써주면 된다.
//위 세개의 알파벳은 X, Y, Z 로 변환되어야 하지만, 3을 뺄 경우 >, ?, @ 문자로 변환되기 때문
//따라서 위 세개의 알파벳은 -3이 아닌 +23을 해줘서 X, Y, Z 를 출력

import java.util.*;
public class A050_YearaChoi_20250112 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char result;

        for(int i=0; i<input.length(); i++){
            if(input.charAt(i) <= 'C'){
                result = (char)(input.charAt(i)+23);
            }else{
                result = (char)(input.charAt(i)-3);
            }
            System.out.print(result);
        }
        sc.close();
    }
}