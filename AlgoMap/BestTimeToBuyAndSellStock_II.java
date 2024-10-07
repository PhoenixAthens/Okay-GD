package AlgoMap;

public class BestTimeToBuyAndSellStock_II {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;
        for(int i: prices){
            minPrice = Math.min(minPrice,i);
            int profit = i - minPrice;
            if(profit > 0) {
                maxProfit += profit;
                minPrice = i;
            }
        }
        return maxProfit;
    }
}
