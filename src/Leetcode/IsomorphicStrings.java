package Leetcode;
public class IsomorphicStrings {
    public static void main(String[] args) {
    }
    public static boolean isIsomorphic(String s, String t) {
        int[] sArr = new int[200];
        int[] tArr = new int[200];

        int len = s.length();

        if (len != t.length()) {
            return false;
        }

        for (int i = 0; i < len; i++) {
            if (sArr[s.charAt(i)] != tArr[t.charAt(i)]) {
                return false;
            }

            sArr[s.charAt(i)] = i+1;
            tArr[t.charAt(i)] = i+1;
        }

        return true;
    }

}
