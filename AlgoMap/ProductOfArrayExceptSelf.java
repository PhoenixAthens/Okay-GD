package AlgoMap;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int prodLeft=1;
        int prodRight=1;
        int[] result = new int[nums.length];
        for(int i=0;i<result.length;i++)result[i]=1;
        for(int i=0;i<nums.length;i++){
            result[i]*=prodLeft;
            prodLeft*=nums[i];
        }
        for(int i=nums.length-1;i>=0;i--){
            result[i]*=prodRight;
            prodRight*=nums[i];
        }
        return result;
    }
}
