package Tbank;

import java.util.*;

public class DatingGames {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextLong();
        }
        long counter = 0;

        int[] l = new int[n];
        int[] r = new int[n];

        boolean[] exists = new boolean[n];
        for (int i = 0; i < n; i++) {
            l[i] = i - 1;
            r[i] = i + 1 < n ? i + 1 : -1;
            exists[i] = true;
        }

        TreeSet<long[]> edges = new TreeSet<>(
                (x, y) -> x[1] != y[1]
                        ? Long.compare(y[1], x[1])
                        : Integer.compare((int)x[0], (int)y[0])
        );
        long[][] pairs = new long[n][];

        for (int i = 0; i + 1 < n; i++) {
            long j = Math.abs(a[i] - a[i + 1]);
            pairs[i] = new long[]{i, j};
            edges.add(pairs[i]);
        }

        int remain = n;
        while (remain > 1) {
            long[] cur = edges.pollFirst();
            int i = (int) cur[0];
            int j = r[i];
            if (j < 0 || !exists[i] || !exists[j]) {
                continue;
            }

            counter += cur[1];
            exists[i] = exists[j] = false;
            remain -= 2;

            int k = l[i], m = r[j];
            if (k >= 0 && pairs[k] != null) {
                edges.remove(pairs[k]);
                pairs[k] = null;
            }
            if (j >= 0 && pairs[j] != null) {
                edges.remove(pairs[j]);
                pairs[j] = null;
            }

            if (k >= 0) {
                r[k] = m;
            }
            if (m >= 0) {
                l[m] = k;
            }

            if (k >= 0 && m >= 0) {
                long dNew = Math.abs(a[k] - a[m]);
                pairs[k] = new long[]{k, dNew};
                edges.add(pairs[k]);
            }
        }

        System.out.println(counter);
    }
}
