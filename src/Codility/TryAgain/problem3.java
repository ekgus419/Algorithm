package Codility.TryAgain;

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
        return A;
    }


}
