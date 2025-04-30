package Leetcode;

public class ValidPalindrome {
    public static void main(String[] args) {

    }
    public static boolean isValid(String s) {
        s = s.replaceAll("[^\\p{L}\\p{N}]+", "").toLowerCase();

        for (int i = 0; i < s.length() / 2 ; i++) {
            if (s.charAt(i) != (s.charAt(s.length()-i-1))) {
                return false;
            }
        }
        return true;

    }
}
