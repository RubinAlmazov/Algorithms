package Leetcode;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {

    }
    public static List<List<String>> group(String[] strs) {
        Map<String, List<String>>map = new HashMap<>();
        for (String i : strs) {
            char[] chars = i.toCharArray();
            Arrays.sort(chars);
            String word = new String(chars);

            if (!map.containsKey(word)) {
                map.put(word, new ArrayList<>());
            }
            map.get(word).add(i);
        }

        return new ArrayList<>(map.values());
    }
}
