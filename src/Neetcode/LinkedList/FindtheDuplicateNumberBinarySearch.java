package Neetcode.LinkedList;


public class FindtheDuplicateNumberBinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,2,2};
        System.out.println(findDuplicate(arr));
    }
    public static int findDuplicate(int[] arr ) {
        int low = 1;
        int high = arr.length-1;

        while (low < high) {
            int mid = low + (high - low) / 2;
            int lessOrEqual = 0;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] <= mid) {
                    lessOrEqual++;
                }
            }

            if (lessOrEqual <= mid) {
                low = mid+1;
            }
            else {
                high = mid;
            }
        }
        return low;
    }
}
