package codeup;

import java.util.Scanner;

//1070 : [기초-조건/선택실행구조] 월 입력받아 계절 출력하기(설명)
public class dh1070 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        switch (num) {
            case 12:
            case 1:
            case 2:
                System.out.print("winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.print("spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.print("summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.print("fall");
                break;
        }


    }
}
