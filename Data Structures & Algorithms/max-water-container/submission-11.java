class Solution {
    public int maxArea(int[] heights) {
		int left = 0;
        int r = heights.length - 1;
        int res = 0;

        while (left < r) {
            int area = Math.min(heights[left], heights[r]) * (r - left);
            res = Math.max(res, area);
            if (heights[left] >= heights[r]) {
                r--;
            } else {
                left++;
            }
        }
        return res;
	}
}
