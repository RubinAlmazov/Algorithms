package Yandex;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.IntStream;

public class TheHighestCostFirst {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();

        int[] mass = IntStream.range(0,N)
                .map(i -> scan.nextInt())
                .toArray();

        int cost = 0;
        int[] value = IntStream.range(0, N)
                .map(i -> scan.nextInt())
                .toArray();

        Integer[] indices = IntStream.range(0, N)
                .boxed()
                .toArray(Integer[]::new);
        Arrays.sort(indices, Comparator.comparingDouble(i -> (double) mass[i] / (double) value[i]));


        for (int index : indices) {
            if (mass[index] <= M) {
                M-= mass[index];
                cost+= value[index];
            }
        }
        System.out.println(cost);

    }
}
