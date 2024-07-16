package SubArraySumDivisibleByK;

class SubArraySumDivK {

    public int subarraysDivByK(int[] nums, int k) {
        int prefSum = 0;
        int result = 0;
        int[] arr = new int[k];
        arr[0] = 1;
        for (int i : nums) {
            prefSum += i;
            int mod = prefSum % k;
            if (mod < 0) mod += k;
            result += arr[mod];
            arr[mod]++;
        }
        return result;
    }
}
