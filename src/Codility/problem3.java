package Codility;

import java.util.Arrays;

//CyclicRotation
public class problem3 {

    public static void main(String[] args) {

        problem3 pb = new problem3();
        int[] a = {3, 8, 9, 7, 6};
        // 회전
        int K = 3;
        int[] result = pb.solution(a, K);
        System.out.println(Arrays.toString(result));
    }

    public int[] solution(int[] A, int K) {
        if(A.length == 0 || K == A.length || K == 0){
            return A;
        }

        int[] tmp = A;
        // 다시짜보기
        int length = A.length;

        for (int j = 0; j < K; j++) {
            int temp = A[length - 1];
            for (int i = length - 1; i >= 1; i--) {
                A[i] = A[i - 1];
            }
            A[0] = temp;
        }
        return A;
    }


}
