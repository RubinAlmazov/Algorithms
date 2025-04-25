package Leetcode;

import java.util.Arrays;

public class StringCompression {
    public static void main(String[] args) {
        char[] chars = {'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        System.out.println(compression(chars));
    }
    public static int compression(char[] chars) {
        int ans = 0;

        for (int i = 0; i < chars.length;) {
            char cur = chars[i];
            int counter = 0;

            while (i < chars.length && chars[i] == cur) {
                i++;
                counter++;
            }

            chars[ans++] = cur;

            if (counter > 1) {
                for (char j : Integer.toString(counter).toCharArray()) {
                    chars[ans++] = j;
                }
            }
        }
        System.out.println(Arrays.toString(chars));
        return ans;

    }
}
