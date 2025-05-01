package Leetcode;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {3,2,4};
        System.out.println(Arrays.toString(twoSum(arr,6)));

    }

    public static int[] twoSum(int[] nums, int target) {
        int l = 0;
        int r = 0;

        while (r < nums.length) {
            if (nums[l] + nums[r] == target && l != r) {
                return new int[] {l,r};
            }
            else {
                r++;
                if (r == nums.length-1) {
                    r = 0;
                    l++;
                }
            }
        }
        return new int[] {};
    }
}
