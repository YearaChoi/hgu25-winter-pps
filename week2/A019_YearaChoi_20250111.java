//https://www.acmicpc.net/problem/2577
import java.util.*;
public class A019_YearaChoi_20250111 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = (sc.nextInt() * sc.nextInt() * sc.nextInt());

        // 정수 `value`를 문자열로 변환하여 각 자리 숫자를 확인할 수 있게 함
        String str = Integer.toString(value);
        sc.close();

        for(int i = 0; i < 10; i++){
            // 특정 숫자(i)의 등장 횟수를 저장할 변수
            int count = 0;

            for(int j = 0; j < str.length(); j++){
                // 문자열의 j번째 문자를 숫자로 변환한 값이 i와 같으면
                if((str.charAt(j) - '0') == i){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
