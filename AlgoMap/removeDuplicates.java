package AlgoMap;

import java.util.HashMap;

public class removeDuplicates {
    public int removeDuplicate(int[] nums) {
        int k = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:nums){
            if(map.get(i)==null){
                map.put(i,1);
                nums[k++]=i;
            }
        }
        return k;
    }
}
