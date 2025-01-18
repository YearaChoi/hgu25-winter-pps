//https://www.acmicpc.net/problem/2753
import java.util.*;
public class A187_YearaChoi_20250118 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();

        if(y % 4 == 0) {
            if (y % 400 == 0) System.out.println("1");
            else if(y % 100 == 0) System.out.println("0");
            else System.out.println("1");
        } else  System.out.println("0");
    }
}
