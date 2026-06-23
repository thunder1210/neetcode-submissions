class Solution {
    public int maxProfit(int[] prices) {
		int max = 0;
		for (int i = 0; i < prices.length; i++) {
			int left = i;
			int right = prices.length - 1;
			
			while (left < right) {
				int temp = prices[right] - prices[left];
				if (temp > max) {
					max = temp;
				}
				right--;
			}
		}
		return max;
    }
}
