package Leetcode;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
    }

    public static String LongestPalindrome(String s) {
        String max = s.substring(0,1);

        for (int i = 0; i < s.length(); i++) {
            int left = i;
            int right = i;
            String cur = "";
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                left--;
                right++;
            }
            cur += s.substring(left+1,right);

            if (cur.length() > max.length()) {
                max = cur;
            }
        }

        for (int i = 0; i < s.length(); i++) {
            int left = i;
            int right = i+1;
            String cur = "";
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                left--;
                right++;
            }
            cur += s.substring(left+1,right);

            if (cur.length() > max.length()) {
                max = cur;
            }
        }
        return max;

    }
}
