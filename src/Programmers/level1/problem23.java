package Programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
같은 숫자는 싫어
배열 arr가 주어집니다.
배열 arr의 각 원소는 숫자 0부터 9까지로 이루어져 있습니다.
이때, 배열 arr에서 연속적으로 나타나는 숫자는 하나만 남기고
전부 제거하려고 합니다.
단, 제거된 후 남은 수들을 반환할 때는
배열 arr의 원소들의 순서를 유지해야 합니다. 예를 들면,

arr = [1, 1, 3, 3, 0, 1, 1] 이면 [1, 3, 0, 1] 을 return 합니다.
arr = [4, 4, 4, 3, 3] 이면 [4, 3] 을 return 합니다.
배열 arr에서 연속적으로 나타나는 숫자는 제거하고 남은 수들을
return 하는 solution 함수를 완성해 주세요.

제한사항
배열 arr의 크기 : 1,000,000 이하의 자연수
배열 arr의 원소의 크기 : 0보다 크거나 같고 9보다 작거나 같은 정수
*/
public class problem23 {
    public static void main(String[] args) {
        problem23 pb = new problem23();
        int[] arr1 = {1, 1, 3, 3, 0, 1, 1};

        int[] test = pb.solution(arr1);
        System.out.println("restult : " + Arrays.toString(test));
    }

    public int[] solution(int[] arr) {
        int length = arr.length;
        int index = 1;
        for (int i = 0; i < length; i++) {
            if(index < length){
                if(arr[i] == arr[index]){
                    arr[i] = -1;
                }
                index++;
            }
        }

        List<Integer> list = new ArrayList<>();
        for (int j = 0; j < length; j++) {
            if(arr[j] != -1){
                list.add(arr[j]);
            }
        }

        int[] answer = new int[list.size()];

        for (int k = 0; k < list.size(); k++) {
            answer[k] = list.get(k);
        }

        return answer;
    }

}