package Alghorithms;

public class IsPrime {
    public static void main(String[] args) {
        System.out.println(isPrime(13));
    }
    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }

        for (int i = 2; i * i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
