package Codeup;

import java.util.Scanner;

//1021 : [기초-입출력] 단어 1개 입력받아 그대로 출력하기(설명)
public class dh1021 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();

        if(str1.length() <= 50){
            System.out.print(str1);
        }

//        System.out.println(Arrays.toString(str2));
    }
}
