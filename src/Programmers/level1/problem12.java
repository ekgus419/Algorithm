package Programmers.level1;

/*
서울에서 김서방 찾기

String형 배열 seoul의 element중 Kim의 위치 x를 찾아,
김서방은 x에 있다는 String을 반환하는 함수, solution을 완성하세요.
seoul에 Kim은 오직 한 번만 나타나며 잘못된 값이 입력되는 경우는 없습니다.

*/
public class problem12 {
    public static void main(String[] args) {
        problem12 pb9 = new problem12();
        String[] str = {"Jane","Kim"};
        String test = pb9.solution(str);
        System.out.println(test);
    }

//    public String solution(String[] seoul) {
//        String answer = "";
//        int x = Arrays.asList(seoul).indexOf("Kim");
//
//        return "김서방은 "+ x + "에 있다";
//    }


    public String solution(String[] seoul) {
        String answer = "";
        int x = 0;
        for(int i=0; i<seoul.length; i++){
            if(seoul[i].equals("Kim")){
                x = i;
            }
        }
        answer = "김서방은 "+ x + "에 있다";
        return answer;
    }
}