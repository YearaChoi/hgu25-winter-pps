//https://www.acmicpc.net/problem/2455
import java.util.*;
public class A020_YearaChoi_20250111 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 0;
        int max = 0;
        for(int i=0; i < 4; i++){
            total = total - sc.nextInt() + sc.nextInt();
            if (total > max){
                max = total;
            }
        }
        System.out.println(max);
    }
}