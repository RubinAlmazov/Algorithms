package Tbank;

import java.util.Scanner;

public class AlmostPalindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();


        for (int i = 0; i < s.length(); i++) {
            String palindrome = s.substring(0, i) + s.substring(i+1);
            if (isPalindrome(palindrome)) {
                System.out.println("Yes");
                return;
            }
        }

        System.out.println("No");
    }

    public static boolean isPalindrome(String s) {
        for (int i = 0; i < s.length()/2; i++) {
            if (s.charAt(i) != s.charAt(s.length()-i-1)) {
                return false;
            }
        }
        return true;
    }
}

