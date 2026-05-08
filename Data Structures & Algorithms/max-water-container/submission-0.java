class Solution {
    public int maxArea(int[] heights) {
        int area = 0;
		int left = 0, right = heights.length - 1;

		while (left < right) {
			int currentArea = Math.min(heights[left], heights[right]) * (right - left);
			if (currentArea > area) {
				area = currentArea;
			}
			if (heights[left] > heights[right]) {
				right--;
			} else {
				left++;
			}
		}
		return area;
    }
}
