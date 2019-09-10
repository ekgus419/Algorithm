package Codeup;

import java.util.Scanner;
//1063 : [기초-삼항연산] 두 정수 입력받아 큰 수 출력하기(설명)
public class dh1063 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
        String[] str2 = str1.split(" ");
        int a = Integer.parseInt(str2[0]);
        int b = Integer.parseInt(str2[1]);

        System.out.printf("%d",a > b ? a : b);

    }
}
