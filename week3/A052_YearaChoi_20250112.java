//https://www.acmicpc.net/problem/8958
import java.util.*;
public class A052_YearaChoi_20250112 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i=0; i<N; i++){
            String str = sc.next();
            int count = 0;
            int score = 0;
            for(int j=0; j<str.length(); j++){
                if(str.charAt(j)=='X') {
                    count = 0;
                } else if (str.charAt(j)=='O') {
                    count += 1;
                    score += count;
                }
            }
            System.out.println(score);
        }
    }
}