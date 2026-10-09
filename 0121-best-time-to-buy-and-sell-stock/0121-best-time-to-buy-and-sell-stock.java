class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int minPrice = prices[0];
        int maxProfit = 0;

        for(int i=0; i<n; i++){
            minPrice = Math.min(minPrice, prices[i]);

            int profit = prices[i]-minPrice;
            maxProfit = Math.max(maxProfit, profit);
        }
        return maxProfit;
    }
}