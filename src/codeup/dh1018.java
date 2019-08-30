package codeup;

import java.util.Scanner;

//1018 : [기초-입출력] 시간 입력받아 그대로 출력하기(설명)
public class dh1018 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
        String[] str2 = str1.split(":");

        System.out.println(str2[0] + ":" + str2[1]);
    }
}
