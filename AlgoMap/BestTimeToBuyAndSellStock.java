package AlgoMap;

public class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for(int i: prices){
            if(i < minPrice){
                minPrice = i;
            }
            int profit = i - minPrice;
            if(profit > maxProfit){
                maxProfit = profit;
            }
        }
        return maxProfit;

    }
}
