package Neetcode.ArraysAndHashing;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3};
        System.out.println(hasDuplicate(arr));
    }

    public static boolean hasDuplicate(int[] nums) {
        int left = 0;
        int right = 0;
        while (left < nums.length) {
            if (nums[left] == nums[right] && left != right) {
                return true;
            }

            if (right == nums.length-1) {
                right = 0;
                left++;
            }
            right++;
        }
        return false;
    }

}
