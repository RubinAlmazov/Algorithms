package Neetcode.ArraysAndHashing;

import java.util.HashMap;

public class TopKFrequentElements {
    public static void main(String[] args) {}

    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> top = new HashMap<>();
        int[] result = new int[k];

        for (int i : nums) {
            top.put(i, top.getOrDefault(i, 0) + 1);
        }

        for (int j = 0; j < k; j++) {
            int maxFreq = 0;
            int keyWithMax = 0;
            for (int key : top.keySet()) {
                if (top.get(key) > maxFreq) {
                    maxFreq = top.get(key);
                    keyWithMax = key;
                }
            }
            result[j] = keyWithMax;
            top.remove(keyWithMax);
        }
        return result;
    }
}
