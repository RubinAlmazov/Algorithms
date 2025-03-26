package Neetcode.TwoPointers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args){
        int[] array = {-1,0,1,2,-1,-4}; // 0 1 -1
        System.out.println(threeSum(array));
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    if ( nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> triplet = new ArrayList<>();
                        triplet.add(nums[i]);
                        triplet.add(nums[j]);
                        triplet.add(nums[k]);

                        Collections.sort(triplet);

                        if (!list.contains(triplet)) {
                            list.add(triplet);
                        }


                    }
                }
            }

        }




        return list;
    }
}
