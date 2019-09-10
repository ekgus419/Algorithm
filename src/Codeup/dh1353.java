package Codeup;

import java.util.Scanner;

//1353 : 삼각형 출력하기 1 (별찍기1)
public class dh1353 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int start = scan.nextInt();
        for(int i=1; i<=start; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
