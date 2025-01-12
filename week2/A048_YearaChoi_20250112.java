//https://www.acmicpc.net/problem/1316
import java.util.Scanner;

public class A048_YearaChoi_20250112 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (isGroupString(sc.next()))
                count++;
        }
        System.out.println(count);
        sc.close();
    }
    static boolean isGroupString(String str) {
        boolean alpha[] = new boolean[26];

        for (int i = 0; i < str.length(); i++) {
            // 현재 문자와 이전 문자를 저장
            int now = str.charAt(i);
            int prev = (i > 0) ? str.charAt(i - 1) : 0; // 이전 문자 (첫 문자일 경우 0)

            // 현재 문자가 처음 등장하는 경우
            if (alpha[now - 'a'] == false)
                alpha[now - 'a'] = true;

            // 현재 문자가 이전 문자와 다른데, 이미 등장했던 경우 그룹 단어가 아님
            else if (now != prev)
                return false;
        }

        // 모든 문자가 조건을 만족하면 그룹 단어로 판단
        return true;
    }
}
