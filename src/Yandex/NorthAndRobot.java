package Yandex;

import java.util.*;

public class NorthAndRobot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();

        ArrayList<String> routes = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            routes.add(scan.nextLine());
        }

        ArrayList<String> from = new ArrayList<>();
        ArrayList<String> where = new ArrayList<>();

        for (String curString : routes) {
            int firstSpace = curString.indexOf(' ');
            int secondSpace = curString.indexOf(' ', firstSpace + 1);

            from.add(curString.substring(0, secondSpace));
            where.add(curString.substring(secondSpace + 1));
        }

        Map<String, Integer> in  = new HashMap<>();
        Map<String, Integer> out = new HashMap<>();
        for (String f : from) {
            out.put(f, out.getOrDefault(f, 0) + 1);
        }
        for (String w : where) {
            in.put(w, in.getOrDefault(w, 0) + 1);
        }

        String start = null;
        String finish = null;
        Set<String> all = new HashSet<>();
        all.addAll(from);
        all.addAll(where);

        for (String addr : all) {
            int i = in.getOrDefault(addr, 0);
            int o = out.getOrDefault(addr, 0);

            if (o - i == 1) {
                if (start == null) start = addr;
                else { System.out.println("-1"); return; }
            } else if (i - o == 1) {
                if (finish == null) finish = addr;
                else { System.out.println("-1"); return; }
            } else if (o != i) {
                System.out.println("-1");
                return;
            }
        }

        if (start != null && finish != null) {
            System.out.println(start + " " + finish);
        } else {
            System.out.println("-1");
        }
    }
}
