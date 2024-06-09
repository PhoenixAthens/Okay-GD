package FindTheChildWhoHasTheBallAfter_K_Seconds;

public class ChildWithBall {

    public static void main(String... args) {
        System.out.println(numberOfChild(3, 5));
        System.out.println(numberOfChild(5, 6));
        System.out.println(numberOfChild(4, 2));
    }

    public static int numberOfChild(int n, int k) {
        boolean flag = true;
        int i = 0;
        for (int j = 0; j < k; j++) {
            if (i == n - 1) flag = false;
            if (i == 0) flag = true;
            if (flag) i++;
            else i--;
        }
        return i;
    }
}
