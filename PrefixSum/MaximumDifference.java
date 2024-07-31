package PrefixSum;

public class MaximumDifference {
    public static int maxDiff(int[] arr){
        int maxSoFar = arr[arr.length-1];
        int maxDiff = 0;
        for(int i = arr.length-2;i>=0;i--){
            maxDiff = Math.max(maxDiff,maxSoFar-arr[i]);
            maxSoFar = Math.max(maxSoFar, arr[i]);
        }
        return maxDiff;
    }
    public static void main(String... args){
        int[] arr = {1, 2, 90, 10, 110};
        int[] arr2 = {80, 2, 6, 3, 100};
        System.out.println(maxDiff(arr));
        System.out.println(maxDiff(arr2));

    }
}
