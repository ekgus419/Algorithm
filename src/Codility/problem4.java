package Codility;

import java.util.Arrays;

//baaabbabbb => return 7
public class problem4 {

    public static void main(String[] args) {

        problem4 pb = new problem4();
       int[] arr = {1,25,2,3,6};
       int n = 5;
       int[] result = pb.solution(arr,5);

        System.out.println(Arrays.toString(result));
    }

    public int[] solution(int[] list, int n) {
        int min;
        int temp;
        for(int i = 0; i<n; i++){
            min = list[i];
            for(int j = i+1; j<n; j++){
                if( list[i] < list[j]){
                    min = list[j];
                }
            }
            temp = min;
            min = list[i];
            list[i]=temp;
        }

        Arrays.toString(list);
        return  list;
    }


}
