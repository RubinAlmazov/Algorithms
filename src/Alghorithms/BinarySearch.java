package Alghorithms;



import static Alghorithms.BubbleSort.bubbleSort;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,6,78,9,6,4,1,5,67,72,4,5,678,54};
        bubbleSort(arr);
        System.out.println(searchBinaryRecursive(arr, 0, arr.length-1, 100));

    }
    public static int searchBinaryRecursive(int[] arr, int startIndex, int endIndex, int elToFind) {
        if (endIndex >= startIndex) {
//          we used left + (right - left) / 2 rather than (right + left) / 2 cause it excludes overflow
            int middleIndex = startIndex + (endIndex - startIndex) / 2;

            if (arr[middleIndex] == elToFind) {
                return middleIndex;
            }

            if (arr[middleIndex] > elToFind) {
                return searchBinaryRecursive(arr, startIndex, middleIndex-1, elToFind);
            }
            else {
                return searchBinaryRecursive(arr, middleIndex+1, endIndex, elToFind);
            }
        }
        return -1;
    }

    public static int searchBinary(int[] arr, int elToFind) {
        int startIndex = 0;
        int endIndex = arr.length-1;
        int middleIndex;
        System.out.println("element to find:" + elToFind);

        while (startIndex <= endIndex) {
//          we used left + (right - left) / 2 rather than (right + left) / 2 cause it excludes overflow
            middleIndex = startIndex + (endIndex - startIndex) / 2;
            System.out.println("start: " + startIndex + ",end:" + endIndex + ",middleIndex:" + middleIndex );

            if (arr[middleIndex] == elToFind) {
                System.out.println("found" + elToFind + " at " + middleIndex);
                return middleIndex;
            }

            if (arr[middleIndex] > elToFind) {
                endIndex = middleIndex - 1;
            }
            else {
                startIndex = middleIndex + 1;
            }
        }
        return -1;
    }
}
