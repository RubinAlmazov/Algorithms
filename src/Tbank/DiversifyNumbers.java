package Tbank;

import java.util.*;

public class DiversifyNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Set<Integer> uniq = new HashSet<>();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            recursion(uniq, arr[i]);
        }

        System.out.println(uniq.size());
    }
    public static void recursion(Set<Integer> set, Integer number) {
        if (set.contains(number)) {
            if (number > 0) {
                recursion(set,number/2);
            }
            return;
        }
        set.add(number);
    }
}
