package Alghorithms;

import java.util.Arrays;

public class CountSort {
    public static void main(String[] args) {
        int[] arr = {34,54,6,46,45,13,86,9,24,43,30,74,32};
        countSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void countSort(int[] array) {
        final int MAX_VALUE = 100;

        int[] count = new int[MAX_VALUE];


        for (int k : array) {
            count[k] = count[k] + 1;
        }

        int arrayIndex = 0;
        for (int i = 0; i < count.length; i++) {
            for (int j = 0; j < count[i]; j++) {
                array[arrayIndex] = i;
                arrayIndex++;

            }
        }
    }

}
