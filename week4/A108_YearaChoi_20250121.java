//https://www.acmicpc.net/problem/3062
import java.io.*;
import java.util.*;

public class A108_YearaChoi_20250121 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 테스트 케이스의 개수 입력
        int T = Integer.parseInt(br.readLine());

        // 각 테스트 케이스에 대해 확인
        for (int i = 0; i < T; i++) {
            // 테스트 케이스의 숫자 입력
            int N = Integer.parseInt(br.readLine());

            // 좌우 대칭 여부 확인 후 출력
            if (isSymmetric(N)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    // 좌우 대칭 여부를 확인하는 함수
    private static boolean isSymmetric(int N) {
        // 숫자를 뒤집은 값 계산
        int reversedN = reverseNumber(N);
        // 원래 수와 뒤집은 수를 더함
        int sum = N + reversedN;
        // 합계를 문자열로 변환
        String sumStr = Integer.toString(sum);

        // 문자열이 좌우 대칭인지 확인
        for (int i = 0; i < sumStr.length() / 2; i++) {
            if (sumStr.charAt(i) != sumStr.charAt(sumStr.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    // 숫자를 뒤집는 함수
    private static int reverseNumber(int num) {
        int reversed = 0;
        // 1의 자리를 하나씩 빼내어 reversed에 추가
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }

}