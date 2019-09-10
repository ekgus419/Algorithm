package Programmers;

/*
하샤드 수

양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다.
예를 들어 18의 자릿수 합은 1+8=9이고,
18은 9로 나누어 떨어지므로 18은 하샤드 수입니다.
자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수,
solution을 완성해주세요.

arr	return
10	true
12	true
11	false
13	false

*/
public class problem7 {
    public static void main(String[] args) {
        problem7 pb7 = new problem7();
        int x = 156;
        boolean test = pb7.solution(x);
        System.out.println(test);
    }


    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0;
        if(x > 0) {

            String str = String.valueOf(x);
            for(int i=0; i<str.length(); i++) {
                sum = sum + Integer.parseInt(str.substring(i,i+1));
            }
            System.out.println(sum);
            if(x % sum == 0){
                answer = true;
            }else{
                answer = false;
            }
        }
        return answer;
    }




//    public boolean solution(int x) {
//        boolean answer = true;
//
//        if(x > 0){
//
//            String[] str = String.valueOf(x).split("");
//
//            int size = str.length;
//            int num = 0;
//            int[] arr = new int [size];
//
//            // arr 배열에 값 할당
//            for(int i=0; i<size; i++) {
//                arr[i] = Integer.parseInt(str[i]);
//            }
//
//            // 할당된 값을 가지고 자리수를 더해 비교
//            for(int i=0; i<size; i++) {
//                System.out.println( "i : " +arr[i]);
//                for(int j=i+1; j<size; j++){
//                    num = arr[i] + arr[j];
//                    System.out.println( "j : " +arr[j]);
//                }
//            }
//            System.out.println(num);
//            if(x % num == 0){
//                answer = true;
//            }else{
//                answer = false;
//            }
//
//        }
//
//        return answer;
//    }


//    String[] str = String.valueOf(x).split("");

//            str.append(String.valueOf(x).split(""));
//            System.out.println(Arrays.toString(String.valueOf(x).split("")));
//            System.out.println(String.valueOf(x).split("").toString());


}