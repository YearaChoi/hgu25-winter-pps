//https://www.acmicpc.net/problem/17210
// N이 6 이상부터는 탈출 불가능
import java.util.*;
import java.io.*;
public class A029_YearaChoi_20250111 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long N = Long.parseLong(br.readLine());
        long B = Integer.parseInt(br.readLine());

        if(N > 5){
            System.out.println("Love is open door");
        } else{
            for(int i=0; i<N-1; i++){
                if(B == 0){
                    System.out.println("1");
                    B = 1;
                }else{
                    System.out.println("0");
                    B = 0;
                }
            }
        }
    }
}