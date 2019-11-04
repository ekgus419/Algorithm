package Boj.stack;

import java.util.Scanner;
import java.util.Stack;

public class Problem10828 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Stack<Integer> stack = new Stack<Integer>();
        while (n-- > 0) {
            String str = scan.next();
            if (str.equals("push")) {
                int num = Integer.parseInt(scan.next());
                stack.push(num);
            } else if (str.equals("top")) {
                if (stack.empty()) {
                    System.out.println("-1");
                } else {
                    System.out.println(stack.peek());
                }
            } else if (str.equals("size")) {
                System.out.println(stack.size());
            } else if (str.equals("empty")) {
                if (stack.empty()) {
                    System.out.println("1");
                } else {
                    System.out.println("0");
                }
            } else if (str.equals("pop")) {
                if (stack.empty()) {
                    System.out.println("-1");
                } else {
                    System.out.println(stack.pop());
                }
            }
        }


    }



   /* public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int size = 0;
        int[] stack = new int[n];

        while (n-- > 0) {
            String str = scan.next();
            if (str.equals("push")) {
                int num = Integer.parseInt(scan.next());
                stack[size++] = num;
            } else if (str.equals("top")) {
                if (size == 0) {
                    System.out.println("-1");
                } else {
                    System.out.println(stack[size]);
                }
            } else if (str.equals("size")) {
                System.out.println(size);
            } else if (str.equals("empty")) {
                if (size == 0) {
                    System.out.println("1");
                } else {
                    System.out.println("0");
                }
            } else if (str.equals("pop")) {
                if (size == 0) {
                    System.out.println("-1");
                } else {
                    size -= 1;
                    System.out.println(stack[size]);
                }
            }
        }

    }*/
}
