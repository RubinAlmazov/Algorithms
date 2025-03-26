package Neetcode.BinarySearch;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {-1,0,2,1,6,8};
        System.out.println(search(nums, 4));

    }
    public static int search(int[] nums, int target){
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length-1;

        while (left <= right) {
//          we used left + (right - left) / 2 rather than (right + left) / 2 cause it excludes overflow
            int middle = left + (right - left) / 2;


            if (nums[middle] == target) {
                return middle;
            }
            else if (nums[middle] > target) {
                right--;
            }
            else {
                left++;
            }

        }

        return -1;
    }
}
