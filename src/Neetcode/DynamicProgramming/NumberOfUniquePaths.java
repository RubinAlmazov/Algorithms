package Neetcode.DynamicProgramming;

public class NumberOfUniquePaths {
    public static void main(String[] args) {
        System.out.println(helper(new int[1],3,4));
    }
    public static Integer helper(int[] arr, int n, int m) {
            return paths(n,m,new int[n+1][m+1]);
    }
    static Integer paths(int n, int m, int[][] arr) {
        if (n < 1 || m < 1) {
            return 0;
        }
        if (n == 1 && m == 1) {
            return 1;
        }
        arr[n][m] = paths(n-1,m,arr) + paths(n,m-1,arr);
        return arr[n][m];

    }
}
