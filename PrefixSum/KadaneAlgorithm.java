package PrefixSum;

public class KadaneAlgorithm {
    long maxSubarraySum(int[] arr) {
        boolean allNegative = true;
        long maxVal = Integer.MIN_VALUE;
        for(int i: arr){
            if(i>0)allNegative=false;
            maxVal = Math.max(maxVal,i);
        }
        if(allNegative)return maxVal;

        maxVal = Integer.MIN_VALUE;
        int runningSum = 0;
        for(int i: arr){
            runningSum += i;
            if(runningSum<0){
                runningSum = 0;
            }else{
                maxVal = Math.max(runningSum, maxVal);
            }
        }
        return maxVal;
    }
}
