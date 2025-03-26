package Neetcode.BinarySearch;

public class FindMinimuminRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {3,4,5,6,1,2};
        System.out.println(findMin(arr));
    }
    public static int findMin(int[] nums) {
        int min = Integer.MAX_VALUE;

        int l = 0;
        int r = nums.length-1;


        while (l <= r) {
            int middle = l + (r - l) / 2;


            if (nums[middle] < min) {
                min = nums[middle];
            }

            else if (nums[l] < nums[middle]) {
                if (nums[l] < min) {
                    min = nums[l];
                }

                l = middle + 1;
            }
            else {
                if (nums[r] < min) {
                    min = nums[r];
                }
                r = middle -1;

            }

        }

        return min;
    }
}
