//https://www.acmicpc.net/problem/5355
import java.util.*;
public class A035_YearaChoi_20250112 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());

        for(int i=0 ; i<n ; i++){
            String str = sc.nextLine();
            String[] array = str.split(" ");
            float num = Float.parseFloat(array[0]);
            for(int j = 1 ; j<array.length ; j++){
                if(array[j].equals("@")) num *= 3;
                else if(array[j].equals("%")) num += 5;
                else if(array[j].equals("#")) num -= 7;
            }
            System.out.println(String.format("%.2f",num));
        }
        s.close();
    }
}
