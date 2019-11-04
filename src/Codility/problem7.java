package Codility;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
// 53퍼
public class problem7 {

    public static void main(String[] args) {

        problem7 pb = new problem7();
        int[] A = {3, 1, 2, 4, 3};
        int result = pb.solution(A);
//        System.out.println(result);

    }


    public int solution(int[] A) {

        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> absNum = new ArrayList<>();
        //  3 -> P=1, A[0]
        //  4 -> P=2, A[0]+A[1]
        //  6 -> P=3, A[0]+A[1]+A[2]
        // 10 -> P=4, A[0]+A[1]+A[2]+A[3]
        for (int i = 0; i < A.length - 1; i++) {
            int sum = 0;
            for (int j = 0; j < i + 1; j++) {
                sum = sum + A[j];
            }
            list.add(sum);
        }

        for (int i = 0; i < A.length - 1; i++) {
            int sum = 0;
            for (int j = i + 1; j < A.length; j++) {
                sum = sum + A[j];
            }
            list2.add(sum);
        }

        for (int k = 0; k < list.size(); k++) {
            absNum.add(Math.abs(list.get(k) - list2.get(k)));
        }

        return Collections.min(absNum);

    }
}

