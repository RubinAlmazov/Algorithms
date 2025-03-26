package Alghorithms;

import java.util.Arrays;

public class TwoPointers {
    public static void main(String[] args) {
        int[] array = {1,2,3,4};
        System.out.println(Arrays.toString(twoSum(array,6)));
    }
    public static int[] twoSum(int[] arr, int target) {
        int left = 0;
        int right = arr.length-1;

        while ( left < right) {
            int curSum = arr[left] + arr[right];

            if ( curSum > target) {
                right--;
            }

            else if (curSum < target) {
                left++;
            }
            else {
                return new int[] {left+1, right+1};
            }

        }

        return new int[0];
    }
}
