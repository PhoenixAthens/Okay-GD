package AlgoMap;

public class mergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int num1_pointer = m-1;
        int num2_pointer = n-1;
        int i = nums1.length-1;
        for( ; i >= 0; i--){
            if(num2_pointer<0 || num1_pointer<0)break;
            if(nums2[num2_pointer]>nums1[num1_pointer]){
                nums1[i]=nums2[num2_pointer--];
            }else{
                nums1[i]=nums1[num1_pointer--];
            }
        }
        while(num1_pointer>=0 && i>=0){
            nums1[i--]=nums1[num1_pointer--];
        }
        while(num2_pointer>=0 && i>=0){
            nums1[i--]=nums2[num2_pointer--];
        }
    }
    public static void merge_2(int[] nums1, int m, int[] nums2, int n) {
        int num1_pointer = m-1;
        int num2_pointer = n-1;
        int i = nums1.length-1;
        for( ; i >= 0; i--){
            if(num1_pointer<0){
                nums1[i] = nums2[num2_pointer--];
            }else if(num2_pointer<0){
                break;
            }else if(nums2[num2_pointer]>nums1[num1_pointer]){
                nums1[i]=nums2[num2_pointer--];
            }else{
                nums1[i]=nums1[num1_pointer--];
            }
        }
    }
    public static void main(String... args){
        int[] a = {1,2,3,0,0,0};
        int[] a2 = {2,5,6};
        merge_2(a,3,a2,3);
        System.out.println(java.util.Arrays.toString(a));
        int[] c = {1};
        int[] c2 = {};
        merge_2(c,1,c2,0);
        System.out.println(java.util.Arrays.toString(c));
        int[] e = {0};
        int[] e2 = {1};
        merge_2(e,0,e2,1);
        System.out.println(java.util.Arrays.toString(e));
        int[] g = {2,0};
        int[] g2 = {1};
        merge_2(g,1,g2,1);
        System.out.println(java.util.Arrays.toString(g));

    }
}
