package Yandex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LargeOrSmall{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        while (t-- > 0) {
            int n = scan.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scan.nextInt();
            }

            List<Integer> list = new ArrayList<>();
            int l = 0;
            while (l < arr.length) {
                int min = Integer.MAX_VALUE;
                int curLength = 0;
                int cutLength = l;

                for (int i = l; i < arr.length; i++) {
                    curLength++;
                    min = Math.min(arr[i],min);

                    if (curLength > min) {
                        break;
                    }
                    else {
                        cutLength = i;
                    }
                }

                list.add(cutLength-l+1);
                l = cutLength+1;
            }

            System.out.println(list.size());
            for (int el : list) {
                System.out.print(el + " ");
            }

        }

    }
}