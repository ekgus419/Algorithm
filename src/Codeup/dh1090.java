package Codeup;

import java.util.Scanner;

//1089 : [기초-종합] 수 나열하기1
public class dh1090 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
        String[] str2 = str1.split(" ");

        int a = Integer.parseInt(str2[0]);
        int r = Integer.parseInt(str2[1]);
        int n = Integer.parseInt(str2[2]);

        for (int i = 1; i < n; i++) {
            a *= r;
        }

        System.out.printf("%d", a);
    }

}
