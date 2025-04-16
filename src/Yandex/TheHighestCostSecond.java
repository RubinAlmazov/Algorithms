package Yandex;

import java.util.Scanner;
import java.util.stream.IntStream;

public class TheHighestCostSecond {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();

        int[] mass = IntStream.range(0,N)
                .map(i -> scan.nextInt())
                .toArray();

        int[] value = IntStream.range(0, N)
                .map(i -> scan.nextInt())
                .toArray();

        int[][] dp = new int[N+1][M+1];
        for (int i = 0; i < dp.length; i++) {
            for (int w = 0; w < dp[i].length; w++) {
                if (i == 0 || w == 0) {
                    dp[i][w] = 0;
                }
                else {
                    if (dp[i-1][w] < w) {
                        dp[i][w] = dp[i-1][w];
                    }
                    else {
                        dp[i][w] = Math.max(dp[i-1][w],value[i-1]+dp[i - 1][w - mass[i - 1]]);
                    }
                }
            }
        }

    }
}
