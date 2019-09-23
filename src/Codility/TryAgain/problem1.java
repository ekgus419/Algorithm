package Codility.TryAgain;

import java.util.ArrayList;
import java.util.List;

public class problem1 {

    public static void main(String[] args) {

        problem1 pb = new problem1();
        int n = 32;
        int result = pb.solution(n);
//        System.out.println(result);
    }

    public int solution(int N) {

        int mok = N;
        List<Integer> list = new ArrayList<>();

        // 2진수 구하기
        while (mok > 0) {
            int nmg = mok % 2;
            mok = mok / 2;
            list.add(nmg);
        }

        int count = 1;
        int temp = 0;
        int[] arr = new int[list.size()];

        int index = 0;

        // 구한 2진수 값(역순)을 배열 arr에 할당
        for (int i = list.size() - 1; i >= 0; i--) {
            arr[index] = list.get(i);
            index = index + 1;
        }

        // 0 개수 count
        for (int j = 0; j < arr.length - 1; j++) {
            if (arr[j] != 1) {
                if (arr[j] == 0 && arr[j + 1] == 0) {
                    count++;
                }
            } else {
                temp = count;
                count = 1;
            }
        }

        if(temp > count){
            return temp ;
        }else if(count < temp){
            return count;
        }else {
            return 0;
        }

    }
}