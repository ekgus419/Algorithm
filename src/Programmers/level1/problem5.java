package Programmers.level1;

/*
평균 구하기

정수를 담고 있는 배열 arr의 평균값을 return하는 함수,
solution을 완성해보세요.

arr	return
[1,2,3,4]	2.5
[5,5]	5

*/
public class problem5 {
    public static void main(String[] args) {
        problem5 pb4 = new problem5();
        int[] arr = {1,2,3,4};
        double test = pb4.solution(arr);
        System.out.println(test);
    }

    public double solution(int[] arr) {
        double answer = 0;
        int size = arr.length;
        int sum = 0;

        if(size > 1 && size <= 100){
            for(int i=0; i<size; i++){
                sum += arr[i];
            }
            answer = sum/(double)size;
        }

        return answer;
    }
}