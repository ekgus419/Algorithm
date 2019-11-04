package Boj.stack;

// 스택 구현
public class StackStudy {

    // 구현 해야 할 함수
    // push(넣는거), pop(삭제하는거), top (맨위의꺼), isEmpty

    int size;
    int top;
    int[] stack;

    public  StackStudy(int size){
        this.size = size;
        top = -1;
        stack = new int[size];
    }

    public void push(int data){
        stack[++top] = data;
    }

    public int pop(int data){
        return stack[--top];
    }

    public int top(int data){
        return stack[top];
    }

    public void printStack(){
        for(int i = top; i >= 0 ; i--){
            System.out.println(stack[i]);
        }
    }

    public static void main(String[] args) {
        StackStudy stack = new StackStudy(10);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.pop(4);
        stack.printStack();
        // 3 2 1
    }
}
