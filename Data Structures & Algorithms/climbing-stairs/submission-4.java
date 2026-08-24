class Solution {
    public int climbStairs(int n) { 
        if (n <= 2) return n;
        
        int prev2 = 1; // 前兩階的方法數
        int prev1 = 2; // 前一階的方法數
        int current = 0;
        
        for (int i = 3; i <= n; i++) {
            current = prev1 + prev2; // 當前階數 = 前兩階相加
            prev2 = prev1;
            prev1 = current;
        }
        
        return current;
    }

}
