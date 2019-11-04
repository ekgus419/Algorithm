package Boj.stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Problem1406 {

    // 링크드 리스트 풀이법
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        // 입력 문자열
        String str = bf.readLine();

        // 명령 행 개수
        int n = Integer.parseInt(bf.readLine());

        List<Character> list = new LinkedList<>();

        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }

        int size = list.size();
        int index = list.size();

        while (n-- > 0) {
            String[] line = bf.readLine().split(" ");

            // 커서 왼쪽 한칸 이동
            if (line[0].equals("L")) {
                if(index >= size){
                    index -= 1;
                }
            }
            // 커서 오른쪽 한칸 이동
            else if (line[0].equals("D")) {
                index += 1;
            }
            // 커서 왼쪽 문자 삭제
            else if (line[0].equals("B")) {
                list.remove(index);
            }
            // P 다음 문자 왼쪽 추가
            else if (line[0].equals("P")) {
                if(index >= size){
                    list.add(index, line[1].charAt(0));
                }else{
                    list.add(index+1, line[1].charAt(0));
                }
            }

        }

        System.out.println(list.toString());

    }


    // 스택 풀이법
   /* public static void main(String[] args) throws Exception {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        // 입력 문자열
        String str = bf.readLine();

        // 명령 행 개수
        int n = Integer.parseInt(bf.readLine());

        // 스택 선언
        Stack<Character> leftStack = new Stack<>();
        Stack<Character> rightStack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            // 명령어가 수행되기 전에 커서는 문장의 맨 뒤에 위치해 있으므로
            leftStack.push(str.charAt(i));
        }
        while (n-- > 0) {
            String[] line = bf.readLine().split(" ");

            // 커서 왼쪽 한칸 이동
            if (line[0].equals("L")) {
                if(!leftStack.empty()){
                    rightStack.push(leftStack.pop());
                }
            }
            // 커서 오른쪽 한칸 이동
            else if (line[0].equals("D")) {
                if(!rightStack.empty()){
                    leftStack.push(rightStack.pop());
                }
            }
            // 커서 왼쪽 문자 삭제
            else if (line[0].equals("B")) {
                if(!leftStack.empty()){
                    leftStack.pop();
                }
            }
            // P 다음 문자 왼쪽 추가
            else if (line[0].equals("P")) {
                leftStack.push(line[1].charAt(0));
            }
        }

        // 출력용
        StringBuilder sb = new StringBuilder();

        while(!leftStack.isEmpty()){
            rightStack.push(leftStack.pop());
        }

        while(!rightStack.isEmpty()){
            sb.append(rightStack.pop());
        }

        System.out.println(sb);
    }*/
}
