package Tbank;

import java.util.*;

public class HolidayArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long counter = 0;
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++){
            numbers[i] = scan.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                int iNumber = numbers[i];
                int jNumber = numbers[j];
                int kNumber = jNumber * 2 - iNumber;

                for (int k = j +1; k < n; k++) {
                    if (numbers[k] == kNumber) {
                        counter++;
                    }
                }
            }
        }

        System.out.println(counter);
    }
}
