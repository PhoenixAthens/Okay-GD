package ContinuousSubarraySum;

import java.util.HashMap;

public class ContiSum {
    public static void main(String... args) {
        boolean re = new ContiSum().checkSubarraySum(new int[] { 5, 0, 0, 0 }, 3);
        System.out.println(re);
    }

    public boolean checkSubarraySum_2(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int prefSum = 0;
        for (int i : nums) {
            prefSum += i;
            int modPref = prefSum % k;
            if (!map.isEmpty()) {
                if (modPref == 0 || map.containsKey(modPref))
                    return true;
            }
            map.put(modPref, map.getOrDefault(modPref, 0) + 1);
        }
        return false;
    }

    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int prefSum = 0;
        for (int i = 0; i < nums.length; i++) {
            prefSum += nums[i];
            int mod = prefSum % k;
            int inMap = map.getOrDefault(mod, -2);
            if (inMap != -2) {
                if (i - inMap >= 2)
                    return true;
            } else {
                map.put(mod, i);
            }
        }
        return false;
    }

    // not a good solution
    public boolean checkSubarraySum_withArrays(int[] nums, int k) {
        int[] map = new int[k];
        map[0] = -1;
        int prefSum = 0;
        for (int i = 0; i < nums.length; i++) {
            prefSum += nums[i];
            int mod = prefSum % k;
            int inMap = map[mod];
            if (inMap != 0) {
                if (i - inMap >= 2)
                    return true;
            } else {
                map[mod] = i;
            }
        }
        return false;
    }

}
