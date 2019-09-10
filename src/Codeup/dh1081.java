package Codeup;

import java.util.Scanner;

//1081 : [기초-종합] 주사위를 2개 던지면?(설명)
public class dh1081 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String str1 = scan.nextLine();
        String[] str2 = str1.split(" ");

        int n = Integer.parseInt(str2[0]);
        int m = Integer.parseInt(str2[1]);

        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                System.out.println(i +" " + j);
            }
        }

    }
}
