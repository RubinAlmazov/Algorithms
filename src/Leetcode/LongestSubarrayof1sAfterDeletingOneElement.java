package Leetcode;

public class LongestSubarrayof1sAfterDeletingOneElement {
    public static void main(String[] args) {

    }
    public static int longestSubarray(int[] num) {
        int res = 0;
        int zeros = 0;
        int left = 0;

        for (int right = 0; right < num.length; right++) {

            if (num[right] == 0) {
                zeros++;
            }

            while (zeros > 1) {
                if (num[left] == 0) {
                    zeros--;
                }
                left++;
            }

            res = Math.max(res, right - left);
        }

        return res;

    }
}
