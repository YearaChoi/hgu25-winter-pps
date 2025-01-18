//https://www.acmicpc.net/problem/10867
import java.io.*;
import java.util.*;

public class A083_YearaChoi_20250118 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        Set<Integer> set = new HashSet<>(); // 중복 제거

        for (int i = 0 ; i < N ; i++){
            set.add(Integer.parseInt(st.nextToken()));
        }

        ArrayList<Integer> arry = new ArrayList<>(set);
        Collections.sort(arry); // 오름차순 정렬

        StringBuilder sb = new StringBuilder();
        for (int i : arry) {
            sb.append(i).append(" ");
        }
        System.out.println(sb.toString());
    }
}