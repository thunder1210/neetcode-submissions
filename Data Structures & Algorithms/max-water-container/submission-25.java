class Solution {
    public int maxArea(int[] heights) {
        if (heights == null || heights.length < 2) return 0;

        int max = 0;

        int left = 0;
        int right = heights.length - 1;

        while (left < right) {
            int tmp = Math.min(heights[left], heights[right]);
            max = Math.max((tmp * (right - left)) , max);
            
            if (heights[left] > heights[right]) {
                right--;
            } else {
                left++;
            }
        }
        return max;
    }
}
