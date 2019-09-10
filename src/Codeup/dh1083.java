package Codeup;

import java.util.Scanner;

// 1083 : [기초-종합] 3 6 9 게임의 왕이 되자!(설명)
public class dh1083 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        for (int i = 1; i <= num; i++) { // 횟수 9 ->9까지
            if (i % 3 == 0) {
                System.out.print("X ");
            } else {
                System.out.print(i + " ");
            }

        }

    }
}
