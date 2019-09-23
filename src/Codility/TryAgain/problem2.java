package Codility.TryAgain;

// OddOccurrencesInArray
//         Find value that occurs in odd number of elements.
//         Task Score
//         44%
//         Correctness
//         60%
//         Performance

public class problem2 {

    public static void main(String[] args) {

        problem2 pb = new problem2();
        int[] n = {9, 3, 9, 3, 9, 7, 9}; // 7
        int result = pb.solution(n);
    }

    public int solution(int[] A) {

        int k =0;
        for (int i = 0; i < A.length - 1; i++) {
            for (int j = i + 1; j < A.length; j++) {
                if (A[i] == A[j]) {
                    A[i] = -1;
                    A[j] = -1;
                }
            }
            if(A[i] != -1){
                k = A[i];
            }
        }

        return k;
    }
}
