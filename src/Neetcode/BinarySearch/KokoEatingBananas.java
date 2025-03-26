package Neetcode.BinarySearch;

import java.util.Arrays;

public class KokoEatingBananas {
    public static void main(String[] args) {
        int[] arr = {25,10,23,4};
        System.out.println(minEatingSpeed(arr, 4));
    }
    public static int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = Arrays.stream(piles).max().getAsInt();
        int res = r;

        while (l <= r) {
            int k = l + (r - l ) /2;
            int totalTime = 0;

            for (int pile : piles) {
                totalTime += (int) Math.ceil((double) pile / k);
            }
            if (totalTime <= h) {
                res = k;
                r--;
            }
            else {
                l++;
            }
        }
        return res;
    }
}
