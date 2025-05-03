package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public static void main(String[] args) {
        System.out.println(generateParentheses(3));
    }

    public static List<String> generateParentheses(int n) {
        List<String>list = new ArrayList<>();
        recursion("", list, 0, 0, n);
        return list;
    }
    public static void recursion(String s, List<String> list, int open, int close, int n) {
        if (n * 2 == s.length()) {
            list.add(s);
            return;
        }

        if (open < n) {
            recursion(s + '(', list, open+1, close, n);
        }
        if (close < open) {
            recursion(s + ')', list, open, close+1, n);
        }
    }

}
