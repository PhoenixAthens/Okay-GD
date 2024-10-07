package AlgoMap;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        Arrays.parallelSort(intervals,(a,b)->a[0]-b[0]);
        ArrayList<int[]> resTemp = new ArrayList<>();
        resTemp.add(intervals[0]);
        for(int[] i: intervals){
            int[] last = resTemp.getLast();
            if(last[1]<i[0]){
                resTemp.add(i);
            }else{
                last[1]=Math.max(last[1],i[1]);
            }
        }
        return resTemp.toArray(new int[resTemp.size()][2]);
    }
    public static void main(String...args){
        int[][] multiArr = {{1,3},{2,6},{8,10},{15,18}};
        int[][] multiArr2 = {{1,3},{2,0}};
        Arrays.parallelSort(multiArr,(a,b)->a[0]-b[0]); //ascending
        Arrays.parallelSort(multiArr2,(a,b)->b[0]-a[0]); //descending
        for(int[] a: multiArr2){
            System.out.println(Arrays.toString(a));
        }
    }
}
