package AlgoMap;
import java.util.Arrays;
public class H_Index {
    public int hIndex(int[] citations) {
        Arrays.parallelSort(citations);
        int low = 0;
        int n = citations.length;
        int high = n-1;
        int ans = 0;
        while(low<=high){
            int mid = low + (high-low)/2;
            int idx = n - mid;
            if(citations[mid]>=idx){
                ans = idx;
                high = mid-1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }
    public static int hIndex_2(int[] citations) {
        int n = citations.length;
        int[] counter = new int[n + 1];
        for (int i = 0; i < citations.length; i++) {
            if (citations[i] >= n) {
                counter[n]++;
            } else {
                counter[citations[i]]++;
            }
        }
        int index = 0;
        for (int i = n; i >= 0; i--) {
            index += counter[i];
            if (index >= i) {
                return i;
            }
        }
        return 0;
    }
    public static void main(String... args){
        int[] arr = {3,0,6,1,5};
        int[] arr_2 = {1,3,1};
        System.out.println(hIndex_2(arr));
        System.out.println(hIndex_2(arr_2));

    }
}
