package MostProfitAssigningWork;
import java.util.Arrays;
import java.util.*;
public class test {
    public static void minimumDifference(int[] measurements) {
        Arrays.sort(measurements);

        int minDifference = Integer.MAX_VALUE;
        for (int i = 1; i < measurements.length; i++) {
            int diff = measurements[i] - measurements[i - 1];
            if (diff < minDifference) {
                minDifference = diff;
            }
        }

        List<int[]> result = new ArrayList<>();
        for (int i = 1; i < measurements.length; i++) {
            int diff = measurements[i] - measurements[i - 1];
            if (diff == minDifference) {
                result.add(new int[]{measurements[i - 1], measurements[i]});
            }
        }

        for (int[] pair : result) {
            System.out.println(pair[0] + " " + pair[1]);
        }
    }
    public static void main(String... args){
        int[] me = {-1, 3, 6, -5, 0};
        minimumDifference(me);
    }
}
