package Tbank;
import java.util.*;

public class NikitasHomework {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long a = scan.nextLong();
        long b = scan.nextLong();
        String s = scan.next();

        long counter = 0;
        int permission = 0;

        int len = 2 * n;
        char[] cs = s.toCharArray();
        TreeSet<Integer> opens = new TreeSet<>();
        for (int i = 0; i < len; i++) {
            if (cs[i] == '(') opens.add(i);
        }

        for (int i = 0; i < len; i++) {
            if (cs[i] == '(') {
                permission++;
            } else {
                if (permission > 0) {
                    permission--;
                } else {
                    Integer j = opens.higher(i);
                    if (j != null && a < 2 * b) {
                        counter += a;
                        cs[i] = '(';
                        cs[j] = ')';
                        opens.remove(j);
                        opens.add(i);
                        permission++;  
                    } else {
                        counter += b;
                        cs[i] = '(';
                        opens.add(i);
                        permission++;
                    }
                }
            }
        }

        int res = permission / 2;
        counter += res * b;

        System.out.println(counter);
    }
}
