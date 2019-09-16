package Programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
나누어 떨어지는 숫자 배열

문제 설명
array의 각 element 중 divisor로 나누어 떨어지는 값을
오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.
divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.

제한사항

arr은 자연수를 담은 배열입니다.
정수 i, j에 대해 i ≠ j 이면 arr[i] ≠ arr[j] 입니다.
divisor는 자연수입니다.
array는 길이 1 이상인 배열입니다.

입출력 예
arr	divisor	return
[5, 9, 7, 10]	5	[5, 10]
[2, 36, 1, 3]	1	[1, 2, 3, 36]
[3,2,6]	10	[-1]

*/
public class problem24 {
    public static void main(String[] args) {
        problem24 pb = new problem24();
        int[] arr = {100,20,50};
        int divisor = 10;
        int[] test = pb.solution(arr, divisor);
        System.out.println("restult : " + Arrays.toString(test));
    }

    public int[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                list.add(arr[i]);
            }
        }

        int length = list.size();

        int[] answer = new int[length];
        if (length > 0) {
            for (int i = 0; i < length; i++) {
                answer[i] = list.get(i);
            }
        } else {
            int[] answer2 = new int[1];
            answer2[0] = -1;
            return answer2;
        }

        return answer;
    }
}

