package AlgoMap;

import java.util.HashMap;

public class SortColors {
    public void sortColors(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            if(map.get(i)==null){
                map.put(i,1);
            }else{
                int we = map.get(i);
                map.put(i,++we);
            }
        }
        int j=0;
        for(int elem: map.keySet()){
            int val = map.get(elem);
            for(int i = 0; i < val;i++) {
                nums[j++] = 0;
            }
        }
    }
}
