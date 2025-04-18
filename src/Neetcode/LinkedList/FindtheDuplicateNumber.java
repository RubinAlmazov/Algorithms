package Neetcode.LinkedList;

import java.util.*;
import java.util.stream.IntStream;


public class FindtheDuplicateNumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,2};
        System.out.println(findDuplicate(arr));
    }
    public static int findDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>( );
        List<Integer> list = new ArrayList<>(Arrays.stream(nums)
                .boxed()
                .toList());

        int unUniq = 0;
        for (int el : nums ){
            if (set.contains(el)) {
                unUniq = el;
            }
            set.add(el);
        }

        return unUniq;

    }
}
