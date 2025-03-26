package Neetcode.Stack;

import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("([{}])"));

    }
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        HashMap<Character,Character> map = new HashMap<>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');

        for (char i : s.toCharArray()) {
            if (map.containsKey(i)) {
                System.out.println("Contains " + i);
                if (!stack.isEmpty() && stack.peek().equals(map.get(i))) {
                    stack.pop();
                }
                else {
                    return false;
                }
            }
            else {
                System.out.println("Dont contain " + i);
                stack.push(i);
                System.out.println("Current stack " + stack);
            }
        }


        return stack.isEmpty();


    }

}
