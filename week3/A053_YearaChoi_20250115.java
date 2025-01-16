//https://www.acmicpc.net/problem/10828
import java.io.*;
import java.util.*;
public class A053_YearaChoi_20250112 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        Stack<Integer> stack = new Stack<>();
        int num = sc.nextInt();

        for(int i = 0; i < num; i++) {
            String order = sc.next();

            switch (order) {
                case "push":
                    stack.push(sc.nextInt());
                    break;

                case "pop":
                    if(stack.isEmpty()) {
                        sb.append(-1).append('\n');
                    } else {
                        sb.append(stack.pop()).append('\n');
                    }
                    break;

                case "size":
                    sb.append(stack.size()).append('\n');
                    break;

                case "empty":
                    if(stack.isEmpty()) {
                        sb.append(1).append('\n');
                    }
                    else {
                        sb.append(0).append('\n');
                    }
                    break;

                case "top":
                    if(stack.isEmpty()) {
                        sb.append(-1).append('\n');
                    }
                    else {
                        sb.append(stack.peek()).append('\n');
                    }
                    break;
            }
        }
        System.out.println(sb);
    }
}
