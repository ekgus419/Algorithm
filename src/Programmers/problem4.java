package Programmers;

/*
정수 내림차순으로 배치하기

함수 solution은 정수 n을 매개변수로 입력받습니다.
n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요.
예를들어 n이 118372면 873211을 리턴하면 됩니다.

*/
public class problem4 {
    public static void main(String[] args) {
        problem4 pb4 = new problem4();
        long n  = 118372;
        long test = pb4.solution(n);
        System.out.println(test);
    }

    public long solution(long n) {
        long answer = 0;

        // 입력 받은 n -> String 으로 변환 후 한조각씩 쪼개기
        String str = String.valueOf(n);
        String[] str2 = str.split("");

        Long[] arr = new Long[str2.length];

        Long temp;

        for(int i=0; i<str2.length; i++){
            // 쪼개진 str2를 long형 배열에 저장
//            arr[i] = Integer.parseInt(str2[i]);
            arr[i] = Long.parseLong(str2[i]);
        }

        // 정렬
        for(int j=0; j<arr.length; j++){

            for(int k=j+1; k<arr.length; k++){
                if(arr[j] < arr[k]){
                    temp = arr[k];
                    arr[k] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // StringBuilder를 사용해서 정렬이 된 값을
        // 하나의 Long 값으로 변환
        StringBuilder s = new StringBuilder();

        for (Long i : arr){
            s.append(i);
        }

        answer = Long.parseLong(s.toString());

        return answer;
    }

}