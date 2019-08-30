package codeup;

import java.util.Scanner;

//1080 : [기초-종합] 언제까지 더해야 할까?
public class dh1080 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int sum = 0;

        for(int i=1; i<=num; i++){
            sum = sum + i;
            if(sum >= num){
                System.out.print(i);
                break;
            }
        }


    }
}
