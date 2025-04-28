package Leetcode;

import java.util.stream.IntStream;

public class MovesZeros {
    public static void main(String[] args) {

    }
    public static void moveZeros(int[] nums) {
        int count = (int) IntStream.of(nums).filter(x -> x == 0).count();
        while (count-- > 0) {
            for (int i = 1; i < nums.length; i++) {
                if (nums[i-1] == 0) {
                    int cur = nums[i];
                    nums[i] = nums[i-1];
                    nums[i-1] = cur;
                }
            }
        }
    }
}
