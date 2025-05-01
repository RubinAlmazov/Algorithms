package Yandex;

import java.util.*;
import java.util.stream.IntStream;

public class EfficientLoaders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        List<Integer> zones = IntStream.range(0, n)
                .map(i -> scanner.nextInt())
                .boxed()
                .toList();

        int maxLen = 0;

        for (int i = 0; i < n; i++) {
            int left = i;
            int right = i;
            while (left >= 0 && right < n && zones.get(left).equals(zones.get(right))) {
                int curLen = right - left + 1;
                maxLen = Math.max(curLen, maxLen);
                left--;
                right++;
            }

            left = i;
            right = i + 1;

            while (left >= 0 && right < n && zones.get(left).equals(zones.get(right))) {
                int curLen = right - left + 1;
                maxLen = Math.max(maxLen, curLen);
                left--;
                right++;
            }
        }



        if (maxLen <= 1) {
            System.out.println(0);
        }
        else {
            System.out.println(maxLen);
        }

    }
}
