//https://www.acmicpc.net/problem/11656
import java.io.*;
import java.util.*;
public class A084_YearaChoi_20250118 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        String[] strArr = new String[S.length()];

        for(int i=0; i<S.length(); i++){
            strArr[i] = S.substring(i, S.length());
        }

        Arrays.sort(strArr);

        for(String str : strArr){
            System.out.println(str);
        }
    }
}