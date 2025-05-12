package Tbank;

import java.util.*;

public class MetroMap {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        List<long[]> schedule = new ArrayList<>();
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            schedule.add(i, new long[]{scan.nextLong(), scan.nextLong()});
        }
        int q = scan.nextInt();
        long[] meet = new long[q];
        for (int i = 0; i < q; i++) {
            int branch = scan.nextInt()-1;
            long arrived = scan.nextLong();

            long departure = schedule.get(branch)[0];
            long interval = schedule.get(branch)[1];

            if (departure >= arrived) {
                meet[i] = departure;
            }
            else {
                long calc = (arrived - departure + interval - 1) / interval;
                meet[i] = departure + calc * interval;
            }
        }

        for (long i : meet) {
            System.out.println(i);
        }
    }

}
