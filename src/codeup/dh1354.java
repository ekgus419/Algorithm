package codeup;

import java.util.Scanner;

//1354 : 삼각형 출력하기 2

public class dh1354 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int start = scan.nextInt();

        for(int i=1; i<=start; i++){
            for(int j=1; j<=start+1-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
