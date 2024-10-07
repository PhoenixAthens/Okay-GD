package AlgoMap;

import java.util.HashMap;
import java.util.HashSet;

public class MakeSumDivisibleByP {
    public int minSubarray(int[] nums, int p) {
        int sum = 0;
        for(int i: nums){
            sum+=i%p;
        }
        int target = sum%p;
        if(target==0)return 0;
        int currentSum=0;
        int minLength = nums.length;
        HashMap<Integer,Integer> prefInd = new HashMap<>();
        prefInd.put(0,-1);
        for(int i=0;i<nums.length;i++){
            currentSum = (currentSum+nums[i])%p;
            int needed = (currentSum-target+p)%p;
            if(prefInd.containsKey(needed)) minLength=Math.min(minLength,i-prefInd.get(needed));
            prefInd.put(currentSum,i);
        }
        return minLength==nums.length?-1:minLength;
    }
}
