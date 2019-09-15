package Programmers;

import java.util.Arrays;

/*
자연수 뒤집어 배열로 만들기

자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는
배열 형태로 리턴해주세요.
예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
*/
public class problem10 {
    public static void main(String[] args) {
        problem10 pb10 = new problem10();
        long n = 12345;
        int[] test = pb10.solution(n);
        System.out.println(Arrays.toString(test));
    }

    // 2
    public int[] solution(long n) {
        String[] str = String.valueOf(n).split("");
        int size = str.length;
        int[] answer = new int[size];
        int cnt = 0;
        for(int i=size-1; i >= 0; i--){
            answer[cnt] = Integer.parseInt(str[i]);
            cnt++;
        }

        return answer;
    }

    // 1
//    public int[] solution(long n) {
//        String[] str = String.valueOf(n).split("");
//        int size = str.length;
//        int[] answer = new int[size];
//        for(int i=size-1; i >= 0; i--){
//                answer[size-1-i] = Integer.parseInt(str[i]);
//        }
//
//        return answer;
//    }


}