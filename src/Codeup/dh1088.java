package Codeup;

import java.util.Scanner;

//1088 : [기초-종합] 3의 배수는 통과?(설명)
public class dh1088 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        if(num <= 100){
            for(int i=1; i <= num; i++){
                if(i%3 != 0){
                    System.out.print(i +" ");
                }
            }
        }else{
            System.out.print("Error");
        }

    }

}
