package Yandex;

import java.util.Scanner;
import java.util.stream.IntStream;


public class Sputnik {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int w = scan.nextInt();
        int h = scan.nextInt();
        int n = scan.nextInt();

        boolean[][] curr = new boolean[h][w];
        boolean[][] next = new boolean[h][w];

        int[][] screens = IntStream.range(0, n)
                .mapToObj(i -> IntStream.range(0, 4)
                        .map(j -> scan.nextInt() - 1)
                        .toArray())
                .toArray(int[][]::new);

        int[] dx = {0, 0, -1, 1};
        int[] dy = {-1, 1, 0, 0};

        boolean flag = false;
        int x1 = screens[0][0];
        int x2 = screens[0][2];
        int y1 = screens[0][1];
        int y2 = screens[0][3];

        for (int i = y1; i <= y2; i++) {
            for (int j = x1; j <= x2; j++) {
                curr[i][j] = true;
                flag = true;
            }
        }

        if (flag == false && n > 0) {
            System.out.println("No");
            return;
        }
        if (n == 0) {
            System.out.println("Yes");
            return;
        }

        for (int i = 0; i < n - 1; i++) {
            int x3 = screens[i + 1][0];
            int x4 = screens[i + 1][2];
            int y3 = screens[i + 1][1];
            int y4 = screens[i + 1][3];

            for (int j = 0; j < h; j++) {
                for (int k = 0; k < w; k++) {
                    next[j][k] = false;
                }
            }
            flag = false;

            for (int y = 0; y < h; y++) {
                for (int x = 0; x < w; x++) {
                    if (curr[y][x]) {
                        for (int move = 0; move < 4; move++) {
                            int nextY = y + dy[move];
                            int nextX = x + dx[move];

                            if (nextY >= 0 && nextY < h && nextX >= 0 && nextX < w) {
                                if (nextX >= x3 && nextX <= x4 && nextY >= y3 && nextY <= y4) {
                                    next[nextY][nextX] = true;
                                    flag = true;
                                }
                            }
                        }
                    }
                }
            }
            if (flag == false) {
                System.out.println("No");
                return;
            }
            boolean[][] temp = curr;
            curr = next;
            next = temp;
        }
        System.out.println("Yes");
    }

}