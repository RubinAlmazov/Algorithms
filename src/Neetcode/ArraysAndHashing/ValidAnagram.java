package Neetcode.ArraysAndHashing;

import java.util.HashMap;

public class ValidAnagram {
    public static void main(String[] args) {}

    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();

        for ( char i : s.toCharArray()) {
            if (sMap.containsKey(i)) {
                sMap.put(i, sMap.get(i) + 1);
            }
            else {
                sMap.put(i, 1);
            }
        }

        for ( char i : t.toCharArray()) {
            if (tMap.containsKey(i)) {
                tMap.put(i, tMap.get(i) + 1);
            }
            else {
                tMap.put(i, 1);
            }
        }

        if (sMap.size() != tMap.size()) {
            return false;
        }

        return sMap.equals(tMap);
    }
}
