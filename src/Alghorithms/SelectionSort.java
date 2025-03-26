package Alghorithms;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {12,1325,457,47,242,6236,3};

        for (int i = 0; i < arr.length; i++) {
            int index = min(arr,i);
            int per = arr[i];
            arr[i] = arr[index];
            arr[index] = per;
        }
    }
    public static int min(int[] arr, int startIndex) {
        int minValue = arr[startIndex];
        int minIndex = startIndex;
        for (int i = 0; i<arr.length; i++) {
            if (arr[i] < minValue) {
                minValue  = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
}
