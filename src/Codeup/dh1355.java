package Codeup;

import java.util.Scanner;

//1354 : 삼각형 출력하기 2

public class dh1355 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int start = scan.nextInt();
//        for (int i = 1; i <= start; i++) {
//            for (int j = 1; j <= start; j++) {
//                if(j<i){
//                    System.out.print(" ");
//                }else{
//                    System.out.print("*");
//                }
//            }
//            System.out.println();
//        }

        for (int i = 1; i <= start; i++) {
            for (int j = 1; j <= start; j++) {
                if(i <= j && j<=start){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
