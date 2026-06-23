class Solution {
    public int maxProfit(int[] prices) {
		int minPrice = Integer.MAX_VALUE; // 用來記錄目前看過最低的買入點
        int maxProfit = 0;                // 用來記錄目前找到的最大獲利

        for (int price : prices) {
            // 如果發現更低的買點，就更新它
            if (price < minPrice) {
                minPrice = price;
            } 
            // 如果今天賣出的獲利大於目前記錄的最高獲利，就更新它
            else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }
        
        return maxProfit;
    }
}
