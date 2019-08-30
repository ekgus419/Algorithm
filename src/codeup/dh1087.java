package codeup;

import java.util.Scanner;

//1087 : [기초-종합] 여기까지! 이제 그만~(설명)
public class dh1087 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int sum = 0;
        if(num <= 100000000){
            for(int i=1; i<=num; i++){
                sum += i;
                if(sum >= num){
                    break;
                }
            }
            System.out.print(sum);
        }else{
            System.out.print("Error");
        }

    }

}
