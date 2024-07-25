package KthSymbolInGrammar;

public class Grammar {

    //Time Limit Exceeded
    public int kthGrammar_1(int n, int k) {
        String result = "0";
        for (int i = 1; i < k; i++) {
            char arr[] = result.toCharArray();
            StringBuilder sb = new StringBuilder();
            for (char c : arr) {
                if (i == '0') sb.append("01");
                else sb.append("10");
            }
            result = sb.toString();
        }
        return Integer.parseInt(result.substring(1, result.length() - 1));
    }

    public int kthGrammar_2(int n, int k) {
        String result = "0";
        for (int i = 1; i < k; i++) {
            char arr[] = result.toCharArray();
            StringBuilder sb = new StringBuilder();
            for (char c : arr) {
                if (i == '0') sb.append("01");
                else sb.append("10");
            }
            result = sb.toString();
        }
        return Integer.parseInt(result.substring(1, result.length() - 1));
    }

    //final solution
    public int kthGrammar(int n, int k) {
        if (n == 1) return 0;
        if (k <= Math.pow(2, n - 1) / 2) {
            return kthGrammar(n - 1, k);
        } else {
            int val = kthGrammar(n - 1, (int) (k - Math.pow(2, n - 1) / 2));
            return val == 0 ? 1 : 0;
        }
    }

    public static void main(String... args) {}
}
