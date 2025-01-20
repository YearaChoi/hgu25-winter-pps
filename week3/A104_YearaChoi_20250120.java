//https://www.acmicpc.net/problem/14487
import java.io.*;
import java.util.*;
public class A086_YearaChoi_20250120 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr); // 오름차순 정렬

        int sum = 0;
        for(int i=0; i<N-1; i++){
            sum += arr[i];
        }
        System.out.println(sum);
    }
}