package FindCommonCharacters;

import java.util.*;

class FindCommonCharacters {

    public List<String> commonChars(String[] words) {
        HashMap<Character, int[]> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            char temp[] = words[i].toCharArray();
            for (char c : temp) {
                int arr[] = map.getOrDefault(c, new int[words.length]);
                arr[i]++;
                map.put(c, arr);
            }
        }
        ArrayList<String> list = new ArrayList<>();
        for (char c : map.keySet()) {
            int res[] = map.get(c);
            int min = Integer.MAX_VALUE;
            for (int i : res) {
                min = Math.min(min, i);
            }
            for (int i = 0; i < min; i++) {
                list.add(c + "");
            }
        }
        return list;
    }
}
