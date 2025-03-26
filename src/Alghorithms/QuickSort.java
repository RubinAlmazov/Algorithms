package Alghorithms;

import java.util.Arrays;


public class QuickSort {
    public static void main(String[] args) {
        int[] array = {12,13,14,15,46,32,12,76,87,12,76,45,23,82,61,87,54,35,34,55};
        quickSort(array,0,array.length-1);
        System.out.println(Arrays.toString(array));
    }
    public static void quickSort(int[] arr, int from, int to) {
        if (from < to) {
            int divideIndex = partition(arr, from, to);

            quickSort(arr, from, divideIndex-1);
            quickSort(arr,divideIndex,to);
        }

    }

    public static int partition(int[] arr, int from,int to) {
        int rightIndex = to;
        int leftIndex = from;
        int pivot = arr[from];
        while (leftIndex <= rightIndex) {

            while (arr[leftIndex] < pivot) {
                leftIndex++;
            }

            while (arr[rightIndex] > pivot ) {
                rightIndex--;
            }

            if (leftIndex <= rightIndex) {
                swap(arr, rightIndex, leftIndex);
                leftIndex++;
                rightIndex--;
            }
        }
        return leftIndex;
    }

    public static void swap(int[] array,int index1, int index2) {
        int per = array[index1];
        array[index1] = array[index2];
        array[index2] = per;

    }
}