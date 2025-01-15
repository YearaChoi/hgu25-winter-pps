//https://www.acmicpc.net/problem/1330
import java.io.*;
import java.util.*;
public class A185_YearaChoi_20250112 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        StringTokenizer st = new StringTokenizer(str, " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        System.out.println((A>B) ? ">" : (A<B) ? "<" : "==");
    }
}