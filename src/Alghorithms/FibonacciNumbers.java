package Alghorithms;

public class FibonacciNumbers {
    public static void main(String[] args) {
        System.out.println(fibNaive(100 ));
    }
    public static long fibNaive(int n) {
        if (n <= 1) {
            return n;
        }
        return fibNaive(n-1)+fibNaive(n-2);
    }

    public static long fibEffective(int n) {
        long[] arr = new long[n+1];
        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr[n];
    }
}
