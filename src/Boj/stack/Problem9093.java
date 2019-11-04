package Boj.stack;

import java.io.*;
import java.util.Stack;

// https://www.acmicpc.net/board/view/9744
//.read()메서드는 값을 읽어올 때,int값으로 변형하여 읽어오는 방식입니다.
//예를들어 input.txt에 저장된 1이라는 숫자를 read()를 통해 읽어오면 int형 숫자 1을 읽어오는 것이 아닌,
// txt형식으로 저장된 ASCII 형식의 문자값 '1'을 읽어오는 것이므로
// 결국 int값으론 49를 읽어오는 것이 됩니다.
public class Problem9093 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder("");
        int n = Integer.parseInt(br.readLine());

        while (n-- > 0) {
            String str = br.readLine() + "\n";
            Stack<Character> stack = new Stack<>();
            // 입력받은 문장을 한글자씩 stack에 저장
            for (char ch : str.toCharArray()) {
                if (ch == ' ' || ch == '\n') {
                    while (!stack.isEmpty()) {
                        sb.append(stack.pop());
                    }
                    sb.append(ch);
                }else{
                    stack.push(ch);
                }

            }

        }

        System.out.println(sb);

    }
}
