package AlgoMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeMap;

public class RankTransformOfAnArray {
    public int[] arrayRankTransform(int[] arr) {
//        int[] copyOfArr = Arrays.copyOf(arr,arr.length);
//        Arrays.parallelSort(copyOfArr);
//        HashMap<int,int>
        int[] result = Arrays.copyOf(arr,arr.length);
        Arrays.parallelSort(result);
        HashMap<Integer,Integer> map = new HashMap<>();
        int idx=1;
        for(int i: result){
            if(map.getOrDefault(i,-1)==-1){
                map.put(i,idx++);
            }
        }
        idx = 0;
        for(int i: arr){
            result[idx++]=map.get(i);
        }
        return result;
    }
    public static void main(String... args){
        var make1 = new RankTransformOfAnArray();
        int[] arr1 = {40,10,20,30};
        int[] arr2 = {100,100,100};
        int[] arr3 = {37,12,28,9,100,56,80,5,12};
        System.out.println(Arrays.toString(make1.arrayRankTransform(arr1)));
        System.out.println(Arrays.toString(make1.arrayRankTransform(arr2)));
        System.out.println(Arrays.toString(make1.arrayRankTransform(arr3)));
    }
}
