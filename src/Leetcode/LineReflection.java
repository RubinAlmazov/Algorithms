package Leetcode;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LineReflection {
    public static void main(String[] args) {

    }
    public static boolean isReflected(int[][] arr) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int minX = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE;
        int[][] points = new int[n][2];
        for (int i = 0; i < n; i++) {
            points[i][0] = sc.nextInt();
            points[i][1] = sc.nextInt();
            minX = Math.min(minX, points[i][0]);
            maxX = Math.max(maxX, points[i][0]);
        }
        sc.close();

        int sum = minX + maxX;

        Set<String> set = new HashSet<>();
        for (int[] p : points) {
            set.add(p[0] + "#" + p[1]);
        }

        for (int[] p : points) {
            int x = p[0], y = p[1];
            int reflectedX = sum - x;
            String key = reflectedX + "#" + y;
            if (!set.contains(key)) {
                return false;
            }
        }

        return true;
    }
}
