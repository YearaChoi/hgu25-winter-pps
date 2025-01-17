//https://www.acmicpc.net/problem/2822
import java.io.*;
import java.util.*;
public class A077_YearaChoi_20250117 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] arr = new int[8][2]; // 점수저장
        int[] result = new int[5]; // 상위 5개 점수에 해당하는 인덱스 저장
        int score = 0;

        for(int i=0; i<8; i++){
            arr[i][0] = Integer.parseInt(br.readLine());
            arr[i][1] = i; // 해당 점수 인덱스 저장
        }

        Arrays.sort(arr, new Comparator<int[]>(){
            @Override
            public int compare(int[] o1, int[] o2){
                if(o1[0] < o2[0]) return 1; // 내림차순 정렬
                else if (o1[0] == o2[0]) return 0; // 정렬순서 유지
                else return -1; // 내림차순 정렬
            }
        });

        for(int i=0; i<5; i++){
            score += arr[i][0];
            result[i] = arr[i][1] + 1;
        }

        Arrays.sort(result); // 오름차순 정렬

        System.out.println(score);
        for(int i=0; i<5; i++){
            System.out.print(result[i] + " ");
        }
    }
}