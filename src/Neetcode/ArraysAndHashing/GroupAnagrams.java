package Neetcode.ArraysAndHashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GroupAnagrams {
    public static void main(String[] args) {
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> answer = new ArrayList<>();
        List<Integer> skip = new ArrayList<>();
        for (int i = 0; i < strs.length; i++) {
            char[] word = strs[i].toCharArray();
            Arrays.sort(word);
            List<String> anagrams = new ArrayList<>();
            if (skip.contains(i)) {
                continue;
            }
            anagrams.add(strs[i]);
            for (int j = i + 1; j < strs.length; j++) {
                char[] anagram = strs[j].toCharArray();
                Arrays.sort(anagram);

                if (Arrays.equals(word, anagram)) {
                    anagrams.add(strs[j]);
                    skip.add(j);
                }

            }
            answer.add(anagrams);
        }
        return answer;
    }
}
