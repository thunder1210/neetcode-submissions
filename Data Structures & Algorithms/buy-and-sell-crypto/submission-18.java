class Solution {

    public int maxProfit(int[] prices) {
		int profit = 0;
		for (int left = 0; left < prices.length; left++) {
			int right = prices.length - 1;
			while (right > left) {
				profit = Math.max(profit, prices[right] - prices[left]);
				right--;
			}
		}
        return profit;
    }
}
