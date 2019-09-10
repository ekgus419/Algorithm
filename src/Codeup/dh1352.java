package Codeup;

import java.util.Scanner;
//1352 : 사각형 출력하기 1
public class dh1352 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int start = scan.nextInt();
        for(int i=1; i<=start; i++){
            for(int j=1; j<=start; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
