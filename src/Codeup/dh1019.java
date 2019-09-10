package Codeup;

import java.util.Scanner;

//1019 : [기초-입출력] 연월일 입력받아 그대로 출력하기
public class dh1019 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
        String[] str2 = str1.split("\\.");

        System.out.printf("%04d.%02d.%02d", Integer.parseInt(str2[0]), Integer.parseInt(str2[1]), Integer.parseInt(str2[2]));

    }
}
