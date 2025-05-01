package Leetcode;

import java.util.Arrays;
import java.util.LinkedList;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] arr = {{1,4},{4,5}};
        System.out.println(Arrays.deepToString(merge(arr)));
    }
    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0]));
        LinkedList<int[]>list = new LinkedList<>();
        for (int[] i : intervals) {
            if (list.isEmpty() || list.getLast()[1] < i[0]) {
                list.add(i);
            }
            else {
                list.getLast()[1] = Math.max(list.getLast()[1], i[1]);
            }
        }
        int[][] result = new int[list.size()][2];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }

}
