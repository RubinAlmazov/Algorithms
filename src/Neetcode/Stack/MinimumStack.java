package Neetcode.Stack;

import java.util.Stack;

public class MinimumStack {
    public static void main(String[] args) {

    }

}

class MinStack{
    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();

    }
    public void push(int i) {
        stack.push(i);
        if (minStack.isEmpty() || i < minStack.peek()) {
            minStack.push(i);
        }

    }
    public void pop(){
        if (stack.isEmpty()) {
            return;
        }
        int top = stack.pop();
        if (top == minStack.peek()) {
            minStack.pop();
        }

    }
    public int top() {
        return stack.peek();
    }
    public int getMin() {
        return minStack.peek();
    }
}
