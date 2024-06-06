package HandOfStraights;

import java.util.TreeMap;

public class HOF { //[1,2,3,6,2,3,4,7,8]

    //fix the code below, it works for just 71/84 test cases!

    public boolean isNStraightHand(int[] hand, int groupSize) {
        if (hand.length % groupSize != 0) {
            return false;
        } else {
            TreeMap<Integer, Integer> map = new TreeMap<>();
            for (int i : hand) {
                map.put(i, map.getOrDefault(i, 0) + 1);
            }
            for (int i : map.keySet()) {
                int curr = i + 1;
                for (int j = 1; j < groupSize; j++) {
                    int val = map.getOrDefault(curr, -1);
                    if (val <= 0) return false;
                    map.put(curr, val - 1);
                    curr++;
                }
            }
            return true;
        }
    }

    public static void main(String... args) {
        int[] hand = { 1, 2, 3, 6, 2, 3, 4, 7, 8 };
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i : hand) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        System.out.println(map);
    }
}
