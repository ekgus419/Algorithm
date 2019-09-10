package Programmers;

import java.util.ArrayList;
import java.util.List;

/*
제일 작은 수 제거하기

정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수,
solution을 완성해주세요.
단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요.
예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고,
[10]면 [-1]을 리턴 합니다.

*/
public class problem3 {
    public static void main(String[] args) {
        problem3 pb3 = new problem3();
        int[] answer = {4,3,2,1};
//        int[] answer = {10};
        pb3.solution(answer);
    }

    public int[] solution(int[] arr) {
        int[] answer = {};
        int min = arr[0];
        int size = arr.length;
        int index = 0;
        List<Integer> arr2 = new ArrayList<Integer>();
        if(size == 1){
            return new int[]{-1};
        }else {
            for(int i=0; i<size; i++){
                if(min > arr[i]){
                    min = arr[i];
                    index = i;
                }
                arr2.add(arr[i]);
            }
        }
        arr2.remove(index);
        answer = new int[arr2.size()];
        for(int i=0; i<arr2.size(); i++) {
            answer[i] = arr2.get(i);
        }

        return answer;
    }

}

/*
*  가장 작은 수를 제거한 배열을 리턴
* -> 정렬로 최소값 찾기. -> 최소값을 배열에서 삭제.
* -> 삭제한 배열을 answer에 넣어기.
*
* */