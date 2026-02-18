package Neetcode.ArraysAndHashing;

import java.util.ArrayList;
import java.util.List;

public class EncodeAndDecodeString {
    public static void main(String[] args) {}

    public String encode(List<String> strs) {
        StringBuilder builder = new StringBuilder();
        for (String i : strs) {
            builder.append(i.length()).append('#').append(i);
        }
        return builder.toString();

    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int j = i;
            while (str.charAt(j) != '#') {
                j++;
            }

            int length = Integer.parseInt(str.substring(i,j));
            i = j + 1;
            j = i + length;

            list.add(str.substring(i,j));

            i = j;
        }

        return list;
    }
}
