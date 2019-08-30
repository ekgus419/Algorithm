package codeup;

import java.util.Scanner;

//1351 : 구구단 출력하기 2
public class dh1351 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int start = scan.nextInt();
        int end = scan.nextInt();

        for(int i=start; i<=end; i++){
            for(int j=1; j<=9; j++){
                System.out.println(i +"*" +j+ "=" + i*j);
            }

        }

    }
}
