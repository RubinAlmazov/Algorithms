package Alghorithms;

import java.util.Arrays;

public class CombSort {
    public static void main(String[] args) {
        int[] arr = {15,51245,65324,123,25,1234,423,1};
        combSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void combSort(int[] arr) {
        int gap = arr.length;
        boolean isSorted = false;

        while (!isSorted || gap != 1) {

            if (gap > 1) {
                gap = gap * 10 / 13;
            }
            else {
                gap = 1;
            }

            isSorted = true;
            for (int i = gap; i < arr.length; i++) {
                if (arr[i - gap] > arr[i]) {
                    int per = arr[i];
                    arr[i] = arr[i-gap];
                    arr[i - gap] = per;
                    isSorted = false;
                }
            }


        }
    }
}
