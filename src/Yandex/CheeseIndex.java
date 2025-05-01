package Yandex;

import java.util.Scanner;
import java.util.stream.IntStream;

public class CheeseIndex {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int highestVal = 200;
        long ans = 0;

        int[] val = IntStream.range(0, n)
                .map(i -> scan.nextInt())
                .toArray();

        int[] k = new int[highestVal + 1];
        for (int i = n-1; i >= 0 ; i--) {
            int p = val[i];
            int counter = 0;

            for (int j = p + 1; j <= highestVal; j++) {
                counter+= k[j];
            }

            ans += counter;
            k[p]++;
        }
        System.out.println(ans);
    }

}
