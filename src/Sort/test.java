package Sort;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("매운게 땡긴다(yes) / 담백한게 땡긴다(no)");

        while(scan.hasNext()){
            String str = scan.next();
            if(str.equals("yes")){
                System.out.println("국물(yes) / 국물X(no");
                if(str.equals("yes")){
                    System.out.println("김치찌개, 해물순두부를 파는 콩두로");
                }else{
                    System.out.println("김치찌개, 해물순두부,  ");
                }
            }else{

            }
        }
    }

    // 음식+가중치를
    // 가중치가 높은거가 나올 확률이 더 높게?

}
