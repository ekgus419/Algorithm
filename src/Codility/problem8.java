package Codility;


import java.util.Arrays;

public class problem8 {

    public static void main(String[] args) {

        problem8 pb = new problem8();
        int[] A = {1, 4, 3, 2, 6};
        int result = pb.solution(A);
//        System.out.println(result);

    }


    public int solution(int[] A) {

        if (A == null) {
            return 0;
        }

        Arrays.sort(A);
        // 1 2 3 4
        // 0 1 2 3

        // 정렬 후
        // A[0] ->  최소값
        //
        for (int i = 0; i < A.length - 1; i++) {
            System.out.println(A[i]);
            int number = A[i] + 1;
            for (int j = i + 1; j < A.length; j++) {
                if (number != A[j]) {
                    return 0;
                }else{
                    continue;
                }
            }
        }
        return 1;

    }
}

