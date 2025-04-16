package Yandex;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class HighestWeight {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();

        int mass = 0;

        int[] weights = IntStream.range(0,N).
                map(i -> scan.nextInt()).
                boxed().
                mapToInt(Integer::intValue).
                toArray();

        Arrays.sort(weights);

        for (int i = weights.length-1; i >= 0; i--) {
            if (weights[i] <= M) {
                mass+= weights[i];
                M-= weights[i];
            }
        }
        System.out.println(mass);
    }
}
