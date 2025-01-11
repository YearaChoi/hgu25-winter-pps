//https://www.acmicpc.net/problem/2953
import java.util.*;
public class A033_YearaChoi_20250111 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;

        int max = 0;
        for(int i=0; i<5; i++){
           int sum = 0;
           for(int j=0; j<4; j++){
               sum += sc.nextInt();
           }
           if(sum > max){
               max = sum;
               num = i + 1;
           }
        }
        System.out.println(num+" "+ max);
    }
}