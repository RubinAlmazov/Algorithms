package Neetcode.Stack;

import java.util.Stack;

public class EvaluateReversePolishNotation {
    public static void main(String[] args) {
        String[] arr = {"1","2","+","3","*","4","-"};
        System.out.println(evalRPN(arr));
    }
    public static int evalRPN(String[] tokens) {
        Stack<Integer>stack = new Stack<>();



        for (String i : tokens) {
            if (i.equals("+")) {
                stack.push(stack.pop()+stack.pop());
            }
            else if (i.equals("-")) {
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b-a);
            }
            else if (i.equals("*")) {
                stack.push(stack.pop()*stack.pop());
            }
            else if (i.equals("/")) {
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b/a);
            }
            else {
                stack.push(Integer.parseInt(i));
            }
        }
        return stack.peek();
    }
}
