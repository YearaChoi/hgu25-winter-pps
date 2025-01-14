//https://www.acmicpc.net/problem/4659
//모음(a,e,i,o,u) 하나를 반드시 포함하여야 한다.
//모음이 3개 혹은 자음이 3개 연속으로 오면 안 된다.
//같은 글자가 연속적으로 두번 오면 안되나, ee 와 oo는 허용한다.
import java.util.*;
import java.io.*;
public class A049_YearaChoi_20250112 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        // 모음
        char[] vowels = {'a','e','i','o','u'};

        while (true){
            // br.readLine() -> 한 줄에 하나의 문자열을 읽어옴
            st = new StringTokenizer(br.readLine());
            // 각 줄에 하나의 단어만 있다면, 그 단어가 그대로 input 변수에 저장됨
            String input = st.nextToken();
            if(input.equals("end")) break;
            else{
                boolean acceptable = true;
                boolean hasVowel = false;
                int cntVowel = 0;
                int cntConsonant = 0;
                for(int i=0; i<input.length();i++){
                    char cur = input.charAt(i);
                    boolean isVoewl = false;
                    for(int j=0; j<vowels.length; j++){
                        if(cur == vowels[j]){
                            isVoewl = true;
                            hasVowel = true;
                            // cntVowel은 모음이 연속으로 나올 때 증가, 자음이면 다시 0으로 초기화
                            cntVowel++;
                            cntConsonant = 0;
                            break;
                        }
                    }
                    // 자음이라면
                    if(!isVoewl){
                        // cntConsonatn도 자음이 연속으로 나올 때 증가, 모음이면 0으로 초기화
                        cntConsonant++;
                        cntVowel= 0;
                    }
                    //문자열 끝까지 탐색했는데 모음이 없다면
                    if(i == input.length()-1){
                        if(!hasVowel){
                            System.out.println("<"+input+"> is not acceptable.");
                            acceptable = false;
                            break;
                        }
                    }
                    if(i >= 1){
                        //동일한 문자가 2개 연속되는지
                        if(cur == input.charAt(i-1) && cur != 'e' && cur !='o'){
                            System.out.println("<"+input+"> is not acceptable.");
                            acceptable = false;
                            break;
                        }
                        //모음 혹은 자음이 3개 연속되는지 검사
                        else if(cntVowel >=3 || cntConsonant >=3){
                            System.out.println("<"+input+"> is not acceptable.");
                            acceptable = false;
                            break;
                        }
                    }
                }
                if(acceptable) System.out.println("<"+input+"> is acceptable.");
            }
        }
    }
}