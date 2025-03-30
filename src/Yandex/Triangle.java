package Yandex;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if ( a + b <= c || a + c <= b || c + b <= a ) {
            System.out.println("NO");
        }
        else {
            System.out.println("YES");
        }
    }
}
