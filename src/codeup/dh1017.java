package codeup;

import java.util.Scanner;

//1017 : [기초-입출력] 정수 1개 입력받아 3번 출력하기(설명)

public class dh1017 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        System.out.printf("%d %d %d", num, num, num);

    }
}
