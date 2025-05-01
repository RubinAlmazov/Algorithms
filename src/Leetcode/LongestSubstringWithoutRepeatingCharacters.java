package Leetcode;

import java.util.*;
import java.util.stream.IntStream;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
//        System.out.println(lengthOfLongestSubstring("pwwkew"));
        String s = "pwwkew";
        String str = s.substring(2);
        System.out.println("pwwkew".substring(2));

    }
    public static int lengthOfLongestSubstring(String s) {
        char[] str = s.toCharArray();
        List<Character>list = new ArrayList<>();
        for (char i : str) {
            list.add(i);
        }
        int counter = 0;
        int left = 0;
        int right = 0;

        while (right < list.size()) {
            if (list.subList(left,right).contains(str[right])) {
                left++;
            }
            else {
                right++;
                counter = Math.max(counter, right-left);
            }
        }
        return counter;
    }
}
