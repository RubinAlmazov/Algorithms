package Yandex;

import java.util.Scanner;
import java.util.Stack;

public class WhereAreTheDisadvantages {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();
        scan.close();
        s = s.replaceAll("\\s+", "");


        while (s.contains("--") || s.contains("+-") || s.contains("-+") || s.contains("++")) {
            s = s.replace("--", "+");
            s = s.replace("+-", "-");
            s = s.replace("-+", "-");
            s = s.replace("++", "+");
        }


        int n = s.length();
        int i = 0;
        int sign = 1;
        long num = 0;
        long result = 0;
        Stack<Long> resultStack = new Stack<>();

        while (i < n) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                int j = i;
                while (j < n && Character.isDigit(s.charAt(j))) {
                    j++;
                }
                num = Long.parseLong(s.substring(i, j));
                result += sign * num;
                i = j;
            } else if (c == '+') {
                sign = 1;
                i++;
            } else if (c == '-') {
                sign = -1;
                i++;
            } else if (c == '(') {
                resultStack.push(result);
                resultStack.push((long) sign);
                result = 0;
                sign = 1;
                i++;
            } else if (c == ')') {
                long prevSign = resultStack.pop();
                long prevResult = resultStack.pop();
                result = prevResult + prevSign * result;
                i++;
            } else {
                i++;
            }
        }

        System.out.println(result);
    }
}