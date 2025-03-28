package Neetcode.BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class MedianofTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr = {1,3};
        int[] ar = {2,7,4};

        System.out.println(findMedianSortedArrays(arr,ar));
    }
    public static double findMedianSortedArrays(int[] nums, int[] nums2) {
        int[] arr = IntStream.concat(Arrays.stream(nums),Arrays.stream(nums2)).toArray();

        int len = arr.length;
        if (len % 2 == 0) {
            return arr[(len / 2 - 1)] + arr[(len / 2 )] / 2.0;
        }
        else {
            return arr[(len / 2)];
        }

    }
}

