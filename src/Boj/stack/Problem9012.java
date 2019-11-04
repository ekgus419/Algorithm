package Boj.stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Problem9012 {

    public static String Solution(String str){
        Stack<Character> stack = new Stack<>();
        int cnt = 0;
        if(str.length() > 0){
            for(char ch : str.toCharArray()){
                if(ch == '('){
                    cnt += 1;
                } else {
                    cnt -= 1;
                }
                // 닫는 괄호가 많은 경우
                if(cnt < 0) {
                    return "NO";
                }
            }
            if(cnt == 0){
                return "YES";
            }else{
                // cnt > 0 여는 괄호가 많은 경우
                return "NO";
            }
        }else{
            return "NO";
        }
    }


    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;

        while (n-- > 0) {
            String str = br.readLine();
            System.out.println(Solution(str));
        }

    }
}
