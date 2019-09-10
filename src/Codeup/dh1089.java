package Codeup;

import java.util.Scanner;

//1089 : [기초-종합] 수 나열하기1
public class dh1089 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
        String[] str2 = str1.split(" ");

        // 시작 값
        int a = Integer.parseInt(str2[0]);
        // 등차
        int d = Integer.parseInt(str2[1]);
        // 몇번 째 수
        int n = Integer.parseInt(str2[2]);

        System.out.printf("%d", a+(n-1)*d);

    }

}
