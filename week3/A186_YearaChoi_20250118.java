//https://www.acmicpc.net/problem/9498
import java.io.*;
public class A186_YearaChoi_20250118 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int score = Integer.parseInt(br.readLine());

        if(score >= 90) System.out.println('A');
        else if (score >= 80) System.out.println('B');
        else if (score >= 70) System.out.println('C');
        else if (score >= 60) System.out.println('D');
        else System.out.println('F');
    }
}