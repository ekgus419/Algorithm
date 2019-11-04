package Programmers.level1;

/*
시저 암호
문제 설명
어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다.
예를 들어 AB는 1만큼 밀면 BC가 되고, 3만큼 밀면 DE가 됩니다.
z는 1만큼 밀면 a가 됩니다.
문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수, solution을 완성해 보세요.

제한 조건
공백은 아무리 밀어도 공백입니다.
s는 알파벳 소문자, 대문자, 공백으로만 이루어져 있습니다.
s의 길이는 8000이하입니다.
n은 1 이상, 25이하인 자연수입니다.
입출력 예
s	n	result
AB	1	BC
z	1	a
a B z	4	e F d
*/
public class problem30 {
    public static void main(String[] args) {
        problem30 pb = new problem30();
        String s = "Xy Z";
        int n = 1;
        String result = pb.solution(s, n);
        System.out.println("result : " + result);

    }

    public String solution(String s, int n) {
        String answer = "";
        char charText;
        for(int i = 0; i<s.length(); i++){
            charText = s.charAt(i);
            // 대문자
            if(charText >= 65 && charText <= 90 ){
                charText += n;
                if(charText > 90){
                    charText -= 26;
                }
                answer += charText;
            }
            // 소문자
            else if(charText >= 97 && charText <= 122 ){
                charText += n;
                if(charText > 122){
                    charText -= 26;
                }
                answer += charText;
            }
            // 공백
            else if(charText == 32){
                charText = 32;
                answer += charText;
            }
        }
        return answer;
    }

   /* public String solution(String s, int n) {
        String answer = "";
        byte[] byteText = s.getBytes();

        for(int i = 0; i<byteText.length; i++){
            // 대문자
            if(byteText[i] >= 65 && byteText[i] <= 91 ){
                byteText[i] += n;
                if(byteText[i] > 90){
                    byteText[i] -= 26;
                }
            }
            // 소문자
            else if(byteText[i] > 96 && byteText[i] < 123 ){
                byteText[i] += n;
                if(byteText[i] > 122){
                    byteText[i] -= 26;
                }
            }
            // 공백
            else if(byteText[i] == 32){
                byteText[i] = 32;
            }
;
        }
        answer= new String(byteText);
        return answer;
    }*/
}

