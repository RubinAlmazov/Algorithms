package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public static void main(String[] args) {

    }
    public static List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();

        int start = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (i == nums.length || nums[i] != nums[i-1]+1) {
                if (start == nums[i]) {
                    result.add(String.valueOf(start));
                }
                else {
                    result.add(start + "->" + nums[i]);
                }
                if (i < nums.length) {
                    start = nums[i];
                }
            }
        }
        return result;
    }
}
