package Codeup;

import java.util.Scanner;

//1020 : [기초-입출력] 주민번호 입력받아 형태 바꿔 출력하기
public class dh1020 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
        String[] str2 = str1.split("-");

        //%06d를 사용하면 6칸을 사용해 출력하는데, 한 자리 수인 경우 앞에 0을 붙여 출력한다.

        System.out.printf("%06d%06d", Integer.parseInt(str2[0]), Integer.parseInt(str2[1]));

    }
}
