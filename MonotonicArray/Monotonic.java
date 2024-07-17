package MonotonicArray;

public class Monotonic {

    public boolean isMonotonic(int[] nums) {
        boolean MI = true;
        boolean MD = true;
        int i1 = nums[0];
        //test for MI
        for (int i : nums) {
            if (i < i1) {
                MI = false;
                break;
            }
            i1 = i;
        }
        //test for MD
        for (int i : nums) {
            if (i > i1) {
                MD = false;
                break;
            }
            i1 = i;
        }
        return MI || MD;
    }
}
