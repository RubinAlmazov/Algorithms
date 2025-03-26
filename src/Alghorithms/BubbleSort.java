package Alghorithms;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1;  i < arr.length; i++) {
                if (arr[i] < arr[i-1]) {
                    int per = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = per;
                    isSorted = false;
                }
            }
        }

    }
}
