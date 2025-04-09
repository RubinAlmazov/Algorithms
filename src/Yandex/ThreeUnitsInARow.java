package Yandex;

import java.util.Scanner;

public class ThreeUnitsInARow {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        if (n == 0) {
            System.out.println(1);
            return;
        }

        int[] dp = new int[Math.max(4,n+1)];
        dp[0] = 1;
        dp[1] = 2;
        dp[2] = 4;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
        }

        System.out.println(dp[n]);
    }

}

