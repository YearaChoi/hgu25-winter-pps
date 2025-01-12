//https://www.acmicpc.net/problem/11721
import java.util.*;
public class A047_YearaChoi_20250112 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();

        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i));
            if(i % 10 == 9){
                System.out.println();
            }
        }
    }
}