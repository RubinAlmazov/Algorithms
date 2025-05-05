package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class IntervalListIntersections {
    public static void main(String[] args){

    }
    public static int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        List<int[]>list = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < firstList.length || j < firstList.length ) {

            int start = Math.max(firstList[i][0],secondList[i][0]);
            int end = Math.min(firstList[i][1],secondList[i][1]);

            if (start <= end) {
                list.add(new int[]{start,end});
            }

            if (firstList[i][1] < secondList[i][1]) {
                i++;
            }
            else {
                j++;
            }
        }

        return list.toArray(new int[list.size()][]);
    }
}
