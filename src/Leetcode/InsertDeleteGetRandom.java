package Leetcode;

import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.Random;

public class InsertDeleteGetRandom {
    public static void main(String[] args) {
        RandomizedSet obj = new RandomizedSet();
        boolean param_1 = obj.insert(1);
        boolean param_2 = obj.remove(2);
        int param_3 = obj.getRandom();

        System.out.println(param_1);
        System.out.println(param_2);
        System.out.println(param_3);

    }
}

class RandomizedSet {
    Map<Integer,String> map;
    Random random;
    public RandomizedSet() {
        this.map = new HashMap<>();
        this.random = new Random();
    }

    public boolean insert(int val) {
        if (map.containsKey(val)) {
            return false;
        }
        map.put(val, val + "");
        return true;
    }

    public boolean remove(int val) {
        if (!map.containsKey(val)) {
            return false;
        }
        map.remove(val);
        return true;
    }

    public int getRandom() {
        List<Integer>list = new ArrayList<>(map.keySet());
        return list.get(random.nextInt(list.size()));
    }
}



