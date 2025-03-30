package Yandex;

import java.util.Scanner;

public class Сonditioner {
    public static void main(String[] args) throws IllegalAccessException {
        Scanner scan = new Scanner(System.in);

        int tRoom = scan.nextInt();
        int tCond = scan.nextInt();
        scan.nextLine();
        String mode = scan.nextLine();
        int res;

        switch (mode) {
            case "freeze":
                res = Math.min(tRoom, tCond);
                break;
            case "heat":
                res = Math.max(tRoom, tCond);
                break;
            case "fan":
                res = tRoom;
                break;
            case "auto":
                res = tCond;
                break;
            default:
                throw new IllegalAccessException("Incorrect mode: " + mode);
        }
        System.out.println(res);


    }

}
