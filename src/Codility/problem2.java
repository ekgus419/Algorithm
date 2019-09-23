package Codility;

// https://onsil-thegreenhouse.github.io/programming/java/2018/02/21/java_tutorial_1-23/

import java.util.HashSet;
import java.util.Set;

public class problem2 {

    public static void main(String[] args) {

        problem2 pb = new problem2();
        int[] n = {1,1,1,2,2}; // 7
        int result = pb.solution(n);
        System.out.println("result : " + result);
    }

    public int solution(int[] A) {
        int length = A.length;
        int result = A[0];
        // 범위 추가
        if(length >= 1 && length <= 1000000 && length % 2 != 0){
                Set<Integer> list = new HashSet<>();

                for(int i=0; i<length-1; i++){


                }

                System.out.println("list : " + list.toString());
        }

        return result;
    }



  /*  // TaskScore 55% , Correctness 80%, Performance 25%
    public int solution(int[] A) {
        int length = A.length;
        int result =0;

        if(length >= 1 && length <= 1000000000 && length % 2 == 0){
            // Set -> 순서 x 중복 x
            // HashSet , 순서가 필요없는 데이터를 hash table에 저장. Set 중에 가장 성능이 좋음
            Set<Integer> list = new HashSet<>();

            // 중복되는 값 추출
            for(int i=0; i<length; i++){
                for(int j=i+1; j<length; j++){
                    if(A[i] == A[j]){
                        // set -> 중복되지 않은 값을 저장 중첩 for문을 돌지 않으면 저장되는 값이 9,3,7이라
                        // 한번 더 걸러준다.
                        list.add(A[i]);
                    }
                }
            }

            // 중복되는 값과 원 배열을 비교해 겹치지 않는 수 추출
            for(int k=0; k<length; k++){
                if(!list.contains(A[k])){
                    result = A[k];
                }
            }
        }

        return result;
    }*/


}
