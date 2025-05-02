package Leetcode;

import java.util.*;

public class OneEditDistance {
    public static void main(String[] args) {
        System.out.println(isOneEdit("1203","1213"));
    }
    public static boolean isOneEdit(String s, String t) {

        if (s.length() > t.length() + 1 || t.length() > s.length() + 1 ) {
            return false;
        }

        int i = 0;

        while (i < s.length() && s.charAt(i) == t.charAt(i)) {
            i++;


        }
        if (i == s.length() || i == t.length()) {
            return Math.abs(s.length() - t.length()) == 1;
        }

        if (s.length() == t.length()) {
            return s.substring(i+1).equals(t.substring(i+1));
        }
        else if (s.length() < t.length()) {
            return s.substring(i).equals(t.substring(i+1));
        }
        else {
            return s.substring(i+1).equals(t.substring(i));
        }
    }
}
