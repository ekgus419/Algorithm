package Codility;
// 44% 시간복잡도 초과.
// 공식으로 풀어야함. loop X
public class problem5 {

    public static void main(String[] args) {

        problem5 pb = new problem5();
        int x = 1; // 현재 위치
        int y = 5; // 원하는 곳
        int d = 2; // 이동 거리
        int result = pb.solution(x, y, d);
        System.out.println(result);

    }


    public int solution(int X, int Y, int D) {

        int sum = X;
        int count = 0;
        // 1+2+2
        while (sum < Y) {
            sum = sum + D;
            count++;

        }
        return count;

    }

}
