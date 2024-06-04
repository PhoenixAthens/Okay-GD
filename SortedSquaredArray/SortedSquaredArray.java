package SortedSquaredArray;

import java.util.ArrayList;

public class SortedSquaredArray {

    public static void main(String... args) {
        //test-cases
        //Arr = [-4,-1,0,3,10], [-7,-3,2,3,11], [], [0], [-5,-3,-2,-1], [1,2,3,4,5], [-10,-5,0,5,10], [-3,-1,0,1,3], [-2,-1,0,1,2], [-7,-5,-3,-1,1,3,5,7]
        ArrayList<int[]> testCases = new ArrayList<>();
        testCases.add(new int[] { -4, -1, 0, 3, 10 });
        testCases.add(new int[] { -7, -3, 2, 3, 11 });
        testCases.add(new int[] {});
        testCases.add(new int[] { 0 });
        testCases.add(new int[] { -5, -3, -2, -1 });
        testCases.add(new int[] { 1, 2, 3, 4, 5 });
        testCases.add(new int[] { -10, -5, 0, 5, 10 });
        testCases.add(new int[] { -3, -1, 0, 1, 3 });
        testCases.add(new int[] { -2, -1, 0, 1, 2 });
        testCases.add(new int[] { -7, -5, -3, -1, 1, 3, 5, 7 });
        for (int[] arr : testCases) {
            System.out.println(
                java.util.Arrays.toString(SortSquaredArray(arr))
            );
        }
        //OUTPUT
        /*
        [0, 1, 9, 16, 100]
        [4, 9, 9, 49, 121]
        []
        [0]
        [1, 4, 9, 25]
        [1, 4, 9, 16, 25]
        [0, 25, 25, 100, 100]
        [0, 1, 1, 9, 9]
        [0, 1, 1, 4, 4]
        [1, 1, 9, 9, 25, 25, 49, 49]
        */
    }

    public static int[] SortSquaredArray(int[] input) {
        if (input.length < 1) return input;
        else {
            for (int i = 0; i < input.length; i++) {
                input[i] = input[i] * input[i];
            }
            java.util.Arrays.parallelSort(input);
            return input;
        }
    }
}
