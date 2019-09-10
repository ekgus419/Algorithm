package Codeup;

import java.util.Scanner;

//1015 : [기초-입출력] 실수 입력받아 둘째 자리까지 출력하기(설명)
public class dh1015 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double num = scan.nextDouble();

        System.out.format("%.2f",  num);

    }
}
