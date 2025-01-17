//https://www.acmicpc.net/problem/2164
import java.io.*;
import java.util.*;
public class A070_YearaChoi_20250117 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> q = new LinkedList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        for(int i=1; i<N+1; i++){
            q.offer(i);
        } // 1234

        // 원소가 하나만 남을 때까지
        while (q.size() > 1){
            q.poll();
            q.offer(q.poll());
        }

        System.out.println(q.poll());
    }
}