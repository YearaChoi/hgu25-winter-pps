//https://www.acmicpc.net/problem/1159
import java.io.*;
import java.util.*;

public class A046_YearaChoi_20250112 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[26];

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            arr[s.charAt(0) - 'a']++;
        }

        int cnt = 0;
        for (int i = 0; i < 26; i++) {
            if (arr[i] >= 5) {
                cnt++;
                char c = (char) (i + 'a');
                bw.write(c);
            }
        }

        if (cnt == 0) {
            bw.write("PREDAJA");
        }
        // 출력 스트림을 비워 결과 출력
        bw.flush();
    }
}