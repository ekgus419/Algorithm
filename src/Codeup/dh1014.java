package Codeup;

import java.util.Scanner;

// 코드업 1014 : [기초-입출력] 문자 2개 입력받아 순서 바꿔 출력하기(설명)
public class dh1014 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();

        for(int i=str1.length()-1; i >= 0 ; i--){
            System.out.print(str1.charAt(i));
        }

    }
}
