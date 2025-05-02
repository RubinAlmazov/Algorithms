package Leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("()[]{}"));

    }
    public static boolean isValid(String s) {
        Stack<Character>stack = new Stack<>();
        for (char i : s.toCharArray()) {
            if (i == '(' || i == '[' || i == '{' ) {
                stack.push(i);
            }
            else {
                if (stack.isEmpty()) {
                    return false;
                }
                char cur = stack.pop();
                if (i == ')' && cur != '(' ||
                        i == ']' && cur != '[' ||
                        i == '}' && cur != '{' ) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
