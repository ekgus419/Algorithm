package Codility;

import java.util.Arrays;
// 50퍼
public class problem6 {

    public static void main(String[] args) {

        problem6 pb = new problem6();
        int[] A = {2, 3, 1, 5}; // -> find 4
        int result = pb.solution(A);
        System.out.println(result);

    }


    public int solution(int[] A) {
        // write your code in Java SE 8
        // 차이는 1씩.
        // 최소값을 찾은다음에
        // 1씩 더한다.
        // 그중 없는값을 리턴.
        // 1,2,3,5
        if (A == null) {
            return 0;
        }else if(A.length <= 1){
            return 0;
        }

        Arrays.sort(A);
        int number = 0;

        for (int i = 0; i < A.length - 1; i++) {
            number = A[i] + 1;
            if (number == A[i + 1]) {
            } else {
                number = A[i] + 1;
                break;
            }
        }

        return number;
    }
}

