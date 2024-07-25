package LongestSubStringWithRepeatingCharacters;

public class LongestSubString {

    public int lengthOfLongestSubstring(String s) {
        char[] arr = s.toCharArray();
        int[] map = new int[256];
        int maxLength = 0;
        int runningLength = 0;
        for (int i = 0; i < arr.length; i++) {
            if (map[arr[i]] != 0) {
                maxLength = Math.max(maxLength, runningLength);
                map[arr[i]] = i;
                runningLength = 1;
            }
            map[arr[i]] = i;
            runningLength++;
        }
        return maxLength;
    }
}
