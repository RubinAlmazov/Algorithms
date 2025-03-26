package Neetcode.BinarySearch;

public class Searcha2DMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1,2,4,8}, {11,11,12,13}, {14,20,30,40}};
        System.out.println(searchMatrix(arr,10));
    }
    public static boolean searchMatrix(int[][] matrix, int target) {

        for (int i = 0; i< matrix.length; i++) {
            int right = matrix[i].length-1;
            int left = 0;
            while (left <= right) {
                int middle = left + (right - left) / 2;

                if (matrix[i][middle] == target) {
                    return true;
                }

                else if (matrix[i][middle] > target) {
                    right = middle - 1;
                }
                else {
                    left = middle + 1;
                }


            }
        }
        return false;
    }
}
