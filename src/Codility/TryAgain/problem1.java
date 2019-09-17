package Codility.TryAgain;

import java.util.ArrayList;
import java.util.List;

public class problem1 {

    public static void main(String[] args) {

        problem1 pb = new problem1();
        int n = 33 ;
        int result = pb.solution(n);
//        System.out.println(result);
    }

//    public int solution(int N) {
//        int result = 0;
//        int CurrenBinaryGap = 0;
//
//        String str = Integer.toBinaryString(N);
//        System.out.println("2진수 : " + str);
//
//        for(int i=0; i<str.length(); i++){
//            if(str.charAt(i) == '0'){
//                System.out.println(CurrenBinaryGap);
//                CurrenBinaryGap++;
//            }else{
//                if(CurrenBinaryGap > result){
//                    result = CurrenBinaryGap;
//                }
//                CurrenBinaryGap = 0;
//            }
//            // 0이면 증가. 0이 아니면 이전값과 비교해서 현재값이 이전값보다 크면 result에 현재값 넣는다
//            // 이전값보다 작다면 현재값 = 0
//        }
//        return result;
//    }


    public int solution(int N) {
        List<String> list = new ArrayList<>();
        String[] str = Integer.toBinaryString(N).split("");
        System.out.println("2진수  : "  + Integer.toBinaryString(N));
        int count = 0;
        int temp = 0;

        for(int i=0; i<str.length; i++){
            if(!str[i].equals("1")){
                if(str[i].equals("0") && str[i+1].equals("0")){
                    count++;
                }
            }else{
                temp = count;
                count = 0;
            }
// 1과 1 사이의 0의 개수를 찾아라.
            
//            if(str[i].equals("0") && str[i+1].equals("0")){
//                count++;
//            }else{
//                temp = count;
//                count = 0;
//            }
        } // end of for

        System.out.println("count  : "  + count);
        System.out.println("temp  : "  + temp);

        return 0;
    }
}
