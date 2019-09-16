package Programmers.level1.TryAgain;

/*
최대공약수와 최소공배수

두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환하는 함수,
solution을 완성해 보세요.
배열의 맨 앞에 최대공약수, 그다음 최소공배수를 넣어 반환하면 됩니다.
예를 들어 두 수 3, 12의 최대공약수는 3, 최소공배수는 12이므로
solution(3, 12)는 [3, 12]를 반환해야 합니다.

[유클리드 호제법]

1. 큰수 결정
2. 큰수 / 작은수 -> 몫, 나머지
3. 나머지 조사
    3-1. 나머지 == 0
         최대공약수 = 작은수 , 최소공배수 = 두수의곱 / 최대공약수
    3-2. 나머지 != 0
         큰수 = 작은수
         작은수 = 나머지
         2. 반복
*/
public class problem6 {
    public static void main(String[] args) {
        problem6 pb6 = new problem6();
        int n = 3;
        int m = 12;
        int[] test = pb6.solution(n, m);
        System.out.println(test);
    }

    public int[] solution(int big, int small) {
        int[] answer = new int[2];

        return answer;
    }

}