package Codeup;

import java.util.Scanner;

//1024 : [기초-입출력] 단어 1개 입력받아 나누어 출력하기(설명)
public class dh1024 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
        String[] str2 = str1.split(" ");

        for(int i=0; i<str2.length; i++){
            System.out.println("\'" + str2[i] + "\'");
        }
    }
}
