//https://www.acmicpc.net/problem/1026
import java.util.*;
public class A018_YearaChoi_20250111 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;

        int A[] = new int[num];
        int B[] = new int[num];

        for(int i = 0; i < A.length; i++){
            A[i] = sc.nextInt();
        }

        for(int i = 0; i < B.length; i++){
            B[i] = sc.nextInt();
        }

        Arrays.sort(A);
        Arrays.sort(B);

        for(int i = 0; i<num; i++){
            sum += A[i]*B[num-1-i];
        }
        System.out.println(sum);
    }
}