class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length <= 1) { return nums; }
		List<Integer> result = new ArrayList<>();

		for (int i = 0; (i + k) <= nums.length; i++) {
			int edge = i + (k - 1);
			List<Integer> window = new ArrayList<>();
			for (int j = i; j <= edge; j++) {
				window.add(nums[j]);
			}
			window.sort((a, b) -> b - a);
			result.add(window.get(0));
		}
		return result.stream().mapToInt(i -> i).toArray();
    }
}
