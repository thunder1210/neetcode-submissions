class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
		int bestPrice = Integer.MAX_VALUE;

		for (int i = 0; i < prices.length; i++) {
			if (prices[i] < bestPrice) {
				bestPrice = prices[i];
			} else if (prices[i] - bestPrice > maxProfit) {
				maxProfit = prices[i] - bestPrice;
			}
		}
		return maxProfit;
    }
}
