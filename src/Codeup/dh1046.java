package Codeup;

import java.util.Scanner;

// 코드업 1046 : [기초-산술연산] 정수 3개 입력받아 합과 평균 출력하기
public class dh1046 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str1 = scan.nextLine();
        String[] str2 = str1.split(" ");
        long sum = 0;
        double avg = 0;

        for(int i=0; i<str2.length; i++){
            int num =Integer.parseInt(str2[i]);
            if(num >= -2147483648 && num <= 2147483647){
                sum += num;
            }else{
                System.out.println("-2147483648 ~ 2147483647사이의 정수를 입력하세요.");
                break;
            }

        }

        avg = (double)sum/3;
        System.out.println(sum);
        System.out.format("%.1f",  (double)sum/3);

    }
}
