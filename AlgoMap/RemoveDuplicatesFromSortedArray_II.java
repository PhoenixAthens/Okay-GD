package AlgoMap;

public class RemoveDuplicatesFromSortedArray_II {
    public static int removeDuplicates(int[] nums) {
        int j = 1;
        int count = 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                count++;
            }else{
                count = 1;
            }
            if(count<=2){
                nums[j]=nums[i];
                j++;
            }
        }
        return j;
    }
    public static void main(String... args){
        int[] nums1 = {1,1,1,2,2,3};
        int[] nums2 = {0,0,1,1,1,1,2,3,3};
        removeDuplicates(nums1);
        removeDuplicates(nums2);
        System.out.println(java.util.Arrays.toString(nums1));
        System.out.println(java.util.Arrays.toString(nums2));
    }
}
