package AlgoMap;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] fromMagazine = magazine.toCharArray();
        char[] fromRansomNote = ransomNote.toCharArray();
        int[] arr = new int[26];
        for(char c: fromMagazine){
            arr[c-'a']++;
        }
        for(char c: fromRansomNote){
            if(arr[c-'a']==0)return false;
            arr[c-'a']--;
        }
        return true;
    }
}
