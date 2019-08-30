package codeup;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class other1046 {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String[] input = br.readLine().split(" ");
            int sum = 0;
            int check = 0;
            for (int i = 0; i < input.length; i++) {
                boolean num = NumCheck(input[i]);
                if(num == true &&
                        Long.parseLong(input[i]) >= -2147483648 && Long.parseLong(input[i]) <= 2147483647){
                    sum += Long.parseLong(input[i]);
                    check++;
                }else{
                    System.out.println("-2147483648 ~ 2147483647사이의 정수를 입력하세요.");
                    break;
                }
            }
            if(check == 3){
                System.out.println(sum);
                System.out.format("%.1f", (double)sum/3);
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public static boolean NumCheck(String s){
        try {
            Long.parseLong(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}