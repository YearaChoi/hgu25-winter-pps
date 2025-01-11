//https://www.acmicpc.net/problem/3052
import java.util.*;
public class A034_YearaChoi_20250111 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> h = new HashSet<Integer>();

        for(int i=0; i<10; i++){
            h.add(sc.nextInt() % 42);
        }
        sc.close();
        System.out.println(h.size());
    }
}

// 배열을 이용한 방법
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        boolean[] arr = new boolean[42];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//      Integer.parseInt(br.readLine()) % 42: 입력값의 나머지를 계산
//      arr[... % 42] = true: 해당 나머지를 인덱스로 사용하여 arr 배열의 값을 true로 설정
//      boolean 배열의 기본값이 false이므로, 나머지 값을 처음 처리하는 경우 해당 인덱스가 처음으로 true로 바뀜
//      이미 존재하는 나머지는 true로 이미 설정된 상태라 다시 설정해도 값이 변하지 않음
//      따라서 중복된 나머지는 자동으로 무시됨
        for(int i = 0 ; i < 10 ; i++) {
            arr[Integer.parseInt(br.readLine()) % 42] = true;
        }

        int count = 0;
        for(boolean value : arr) {
            if(value){    // value 가 true 라면
                count++;
            }
        }
        System.out.println(count);
    }
}