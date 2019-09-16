package Programmers.level1;

/*
가운데 글자 가져오기

문제 설명
단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요.
단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.

재한사항
s는 길이가 1 이상, 100이하인 스트링입니다.
입출력 예
s	return
abcde	c
qwer

*/
public class problem15 {
    public static void main(String[] args) {
        problem15 pb = new problem15();
        String s = "abcde";
        String test = pb.solution(s);
        System.out.println(test);
    }

    public String solution(String s) {
        String answer = "";
        int size = s.length();

        if(size >=1 || size <= 100){
//            int index = (int)Math.round((double)size/2);
            int index = size/2;
            if(size % 2 == 0){
                answer = s.substring(index-1, index+1);
            }else{
                answer = s.substring(index, index+1);
            }

        }
        return answer;
    }

}