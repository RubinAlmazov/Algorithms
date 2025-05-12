package Tbank;
import java.util.Scanner;

public class LegendaryTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long res = 0;
        int border = 20;

        int n = scan.nextInt();
        int[] a = new int[n];
        for (int i = 1; i < n; i++) {
            a[i] = scan.nextInt();
        }
        int[] b = new int[n + 1];



        res = dfs(1, n, a, b, border, res);
        System.out.println(res);
    }

    static long dfs(int pos, int n, int[] a, int[] b, int border, long storage) {
        if (pos > n) {
            if (divisorArray(b, n) == 1) {
                long prod = 1;
                for (int i = 1; i <= n; i++) {
                    prod = (prod * b[i]) % 998244353;
                }
                storage = (storage + prod) % 998244353;
            }
            return storage;
        }

        for (int val = 1; val <= border; val++) {
            b[pos] = val;
            if (pos > 1) {
                int x = b[pos - 1], y = b[pos];
                int g = divisor(x, y);
                int p = x / g;
                int q = y / g;
                if (1L * p * q != a[pos - 1]) {
                    continue;
                }
            }
            storage = dfs(pos + 1, n, a, b, border, storage);
        }
        return storage;
    }

    static int divisor(int x, int y) {
        return y == 0 ? x : divisor(y, x % y);
    }

    static int divisorArray(int[] b, int n) {
        int g = b[1];
        for (int i = 2; i <= n; i++) {
            g = divisor(g, b[i]);
            if (g == 1) {
                break;
            }
        }
        return g;
    }
}
