package SumOfSquareNumbers;

public class SumOfSq {

    public boolean judgeSquareSum(int c) {
        double sq = Math.sqrt(c);
        if (sq * sq == c) return true;
        for (int i = 0; i <= sq; i++) {
            int pow2 = i * i;
            double rem = Math.sqrt(c - pow2);
            if (rem == (int) rem) return true;
        }
        return false;
    }

    public static void main(String... args) {
        System.out.println(new SumOfSq().judgeSquareSum(5));
        System.out.println(new SumOfSq().judgeSquareSum(3));
    }
}
