class Solution {

    public int maxProfit(int[] prices) {

		int maxLow = prices[0];
		int profit = 0;

		for (int i = 0; i < prices.length; i++) {
			maxLow = Math.min(prices[i], maxLow);
			profit = Math.max(profit, prices[i] - maxLow);
		}
        return profit;
    }
}
