package MostProfitAssigningWork;

public class MostProfit {

    public int maxProfitAssignment(
        int[] difficulty,
        int[] profit,
        int[] worker
    ) {
        int prof = 0;
        for (int i = 0; i < worker.length; i++) {
            int lastMax = -1;
            for (int j = 0; j < difficulty.length; j++) {
                if (
                    profit[j] > (lastMax >= 0 ? profit[lastMax] : 0) &&
                    difficulty[j] <= worker[i]
                ) {
                    lastMax = j;
                }
            }
            if (lastMax >= 0) {
                prof += profit[lastMax];
            }
        }
        return prof;
    }
}
