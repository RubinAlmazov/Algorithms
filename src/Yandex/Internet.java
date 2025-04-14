package Yandex;

import java.util.*;

public class Internet {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long M = scan.nextLong();
        long[] a = new long[31];

        for (int i = 0; i < 31; i++) {
            a[i] = scan.nextLong();
        }

        for (int i = 1; i < 31; i++) {
            a[i] = Math.max(a[i], 2 * a[i - 1]);
        }

        long ans = Long.MAX_VALUE;
        long cost = 0;
        long remain = M;

        for (int i = 30; i >= 0; i--) {
            long cnt = remain / a[i];
            cost += cnt * (1L << i);
            remain -= cnt * a[i];
            ans = Math.min(ans, cost + (remain > 0 ? (1L << i) : 0));
        }

        System.out.println(ans);
    }
}
