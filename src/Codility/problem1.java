package Codility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class problem1 {

    public static void main(String[] args) {

        problem1 pb = new problem1();
        int n = 173 ;
        int result = pb.solution(n);
    }

    public int solution(int N) {

        String str = Integer.toBinaryString(N);
        List<Integer> list = new ArrayList<>();
        int max = 0;

        // 1이 들어있는 인덱스를 list에 넣는다.
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i) == '1'){
                list.add(i);
            }
        }

        if(list.size() <= 1){
            return max;
        }else{
            // 1이 들어있는 인덱스를 저장
            List<Integer> list2 = new ArrayList<>();

            for(int j = 0; j<list.size()-1; j++){
                // -1 => 인덱스는 0부터 시작
                list2.add(list.get(j+1) - list.get(j) -1);
            }

            // 1이 들어있는 인덱스의 차이를 구한 후, 가장 큰값을 찾는다.
            max = Collections.max(list2);

        }


        return max;

    }



}
