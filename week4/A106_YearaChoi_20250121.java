//https://www.acmicpc.net/problem/3059
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int sum = 0;

        //A~Z까지의 아스키 코드값의 합
        for(int i=0; i<26; i++){
            sum+='A'+i;
        }

        //입력된 문자들의 아스키 코드값 합 
        for(int i=0; i<N; i++)
        {
            int inputSum= 0;

            String S = br.readLine();
            char [] ch = S.toCharArray();
            HashSet<Integer> set = new HashSet<>();

            for(int j=0; j<S.length(); j++){
                // 중복값을 허용하지 않는 Set
                set.add((int)ch[j]);
            }

            // 중복을 배제한 set의 합계를 구함  
            for(int val : set){
                inputSum += val;
            }

            // A~Z 아스키 코드 합 - 입력된 알파벳 합
            System.out.println(sum-inputSum);
        }
    }
}
