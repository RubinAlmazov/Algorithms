package Neetcode.TwoPointers;

import java.util.Arrays;

public class TwoIntegerSumII {
    public static void main(String[] args) {
        int[] array = {1,2,3,4};
        System.out.println(Arrays.toString(sum(array, 13)));
    }

    public static int[] sum(int[] numbers, int target) {
        int[] arr = new int[2];
        for (int j = 0; j < numbers.length; j++) {
            for (int i = j+1; i < numbers.length; i++) {
                if (numbers[i] + numbers[j] == target) {
                    arr[0] = j+1;
                    arr[1] = i+1;
                }

            }
        }
        return arr;
    }
}

