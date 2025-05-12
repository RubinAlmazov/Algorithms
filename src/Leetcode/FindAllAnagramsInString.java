package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagramsInString {
    public static void main(String[] args) {
        System.out.println(findAnagrams("cbaebabacd", "abc"));

    }
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer>res = new ArrayList<>();
        char[] charsP = p.toCharArray();
        Arrays.sort(charsP);

        int j = 0;
        for (int i = p.length()-1; i < s.length(); i++) {
            String anagram = s.substring(j, i+1);
            char[] chars = anagram.toCharArray();
            Arrays.sort(chars);
            if (Arrays.equals(chars,charsP)) {
                res.add(j);
            }
            j++;
        }

        return res;
    }
}
