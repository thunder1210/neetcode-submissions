class Solution {
    public int maxProfit(int[] prices) {
        int left = 0;
		int right = left + 1;
		int result = 0;
		
		while (right < prices.length) {
			if (prices[left] > prices[right]) {
				left = right;
			} else {
				int profit = prices[right] - prices[left];
				result = Math.max(result, profit);
			}
			right++;
		}
		return result;
    }
}
