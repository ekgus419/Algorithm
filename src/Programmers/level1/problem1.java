package Programmers.level1;

import java.util.Scanner;

/*
직사각형 별찍기
두 개의 정수 n과 m이 주어집니다.
별(*) 문자를 이용해 가로의 길이가 n, 세로의 길이가 m인 직사각형 형태를 출력해보세요.

*/
public class problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();   // 가로
        int b = sc.nextInt();   // 세로

        if(a <= 1000 && b <= 1000){
            for(int j=1; j<=b; j++){
                for(int i=1; i<a; i++){
                    System.out.print("*");
                }
                System.out.println("*");
            }

        }
    }


}
