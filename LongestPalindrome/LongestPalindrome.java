package LongestPalindrome;

import java.util.*;

public class LongestPalindrome {

    public static int longestPalindrome(String s) {
        if (s.length() <= 1) return s.length();
        HashMap<Character, Integer> map = new HashMap<>();
        char[] chars = s.toCharArray();
        for (char i : chars) {
            int val = map.getOrDefault(i, 0);
            map.put(i, val + 1);
        }
        int length = 0;
        for (char c : map.keySet()) {
            int count = map.get(c);
            length += count - (count % 2);
        }
        return length < s.length() ? length + 1 : length;
    }
}
