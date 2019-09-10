package Programmers;

import java.util.Scanner;

/*
x만큼 간격이 있는 n개의 숫자

함수 solution은 정수 x와 자연수 n을 입력 받아,
x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다.
다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.
*/
public class problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        problem2 pb2 = new problem2();
        int x = 2;
        int n = 5;
        pb2.solution(x,n);
    }

    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        if(x <= 10000000 && x >= -10000000 && n <=1000){
            for(int i=0; i<n; i++){
                //Long.valueOf(x)
                answer[i] = Long.valueOf(x) * (i+1);
            }
        }

        return answer;
    }

}
