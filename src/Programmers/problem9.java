package Programmers;

import java.util.Arrays;

/*
자릿수 더하기

자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는
solution 함수를 만들어 주세요.
예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.

제한사항
N의 범위 : 100,000,000 이하의 자연수
*/
public class problem9 {
    public static void main(String[] args) {
        problem9 pb9 = new problem9();
        int n = 9871;
        int test = pb9.solution(n);
        System.out.println(test);
    }

    public int solution(int n) {
        int answer = 0;
        String[] str = String.valueOf(n).split("");
        int[] num = new int[str.length];
        for(int i=0; i<str.length; i++){
            num[i] = Integer.parseInt(str[i]);
            answer = answer + num[i] ;
        }

        return answer;
    }
}