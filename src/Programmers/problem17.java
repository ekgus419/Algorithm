package Programmers;

/*
소수 찾기

1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환하는 함수,
solution을 만들어 보세요.

소수는 1과 자기 자신으로만 나누어지는 수를 의미합니다.
(1은 소수가 아닙니다.)

제한 조건
n은 2이상 1000000이하의 자연수입니다

*/
public class problem17 {
    public static void main(String[] args) {
        problem17 pb = new problem17();
        int n = 5;
        int test = pb.solution(n);
        System.out.println("restult : " +test);
    }

    public int solution(int n) {
        int cnt = 0;
        for (int i = 2; i <= n; i++) {
            boolean flag = true;
            for(int j=2; j<i; j++){
                if(i % j == 0 ){
                    flag = false;
                    break;
                }
            }
            if(flag){
                cnt++;
            }

        }
        return cnt;
    }

}