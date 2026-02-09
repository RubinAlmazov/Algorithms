package Neetcode.ArraysAndHashing;

public class TwoSum {
    public static void main(String[] args) {

    }

    public int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = 1;
        while (left < nums.length) {
            if (nums[left] + nums[right] == target) {
                return new int[]{left,right};
            }

            if (right == nums.length - 1) {
                left++;
                right = left;
            }

            right++;
        }
        return new int[]{};
    }
}