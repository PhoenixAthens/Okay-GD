package AlgoMap;

public class JewelAndStones {
    public int numJewelsInStones(String jewels, String stones) {
        int[] arr= new int[52];
        char[] fromStones = stones.toCharArray();
        char[] fromJewels = jewels.toCharArray();
        for(char c: fromStones){
            if(c>=97){
                arr[c-'a'+26]++;
            }else{
                arr[c-'A']++;
            }
        }
        int cnt=0;
        for(char c: fromJewels){
            if(c>=97){
                cnt+=arr[c-'a'+26];
            }else{
                cnt+=arr[c-'A'];
            }
        }
        return cnt;
    }
}
