package Neetcode.BinarySearch;

public class SearchingRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {5,1,3};
        System.out.println(search(arr,3));

    }
    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;

        while (left <= right) {
            int middle = left + (right - left) / 2;

            if (nums[middle] == target) {
                return middle;
            }
            else if (nums[left] == target) {
                return left;
            }
            else if (nums[right] == target) {
                return right;
            }
            else if (nums[left] <= nums[middle] && nums[left] != target) {
                left = middle + 1;
            }
            else {
                right = middle - 1;
            }
        }
        return -1;
    }
}
