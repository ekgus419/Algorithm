package Codeup;

import java.util.Scanner;

//1356 : 사각형 출력하기 2
public class dh1356 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int start = scan.nextInt();
        for(int i=1; i<=start; i++){

            for(int j=1; j<=start; j++){
                if(i == 1 || i == start || j==1 || j==start){
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
