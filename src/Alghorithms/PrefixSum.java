package Alghorithms;

import java.util.Arrays;

public class PrefixSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(createPrefixSum(arr)));
    }
    public static int[] createPrefixSum(int[] array) {
        int[] prefix = new int[array.length];
        for (int i = 1; i < array.length; i++) {
            array[i] += array[i-1];
            prefix = array;
        }

        return prefix;
    }
}
