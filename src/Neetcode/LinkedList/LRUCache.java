package Neetcode.LinkedList;

import java.util.*;

public class LRUCache {
    private final int capacity;
    private final Map<Integer, Integer> map;
    private final Deque<Integer> usage;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.map = new HashMap<>(capacity);
        this.usage = new LinkedList<>();
    }

    public int get(int key) {
        if (!map.containsKey(key)) {
            return -1;
        }

        usage.remove(key);
        usage.addLast(key);
        return map.get(key);
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {

            map.put(key, value);
            usage.remove(key);
            usage.addLast(key);
            return;
        }

        if (map.size() == capacity) {
            int lru = usage.removeFirst();
            map.remove(lru);
        }
        map.put(key, value);
        usage.addLast(key);
    }

    public static void main(String[] args) {
        // ["LRUCache", [2], "put", [1, 1], "put", [2, 2], "get", [1], "put", [3, 3], "get", [2], "put", [4, 4], "get", [1], "get", [3], "get", [4]]
        LRUCache cache = new LRUCache(2);
        cache.put(1,1);
        cache.put(2,2);
        System.out.println(cache.get(1));
        cache.put(3,3);
        System.out.println(cache.get(2));
        cache.put(4,4);
        System.out.println(cache.get(1));
        System.out.println(cache.get(3));
        System.out.println(cache.get(4));
        for (Map.Entry<Integer,Integer> entry : cache.map.entrySet()) {
            System.out.println("key: " + entry.getKey() + " value: " + entry.getValue());
        }
    }

}
