class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
		int max = 0;

		for (int a : nums) {
			set.add(a);
		}

		for (int i = 0; i < nums.length; i++) {
			int counters = 1;
			if (!set.contains(nums[i] - 1)) {
				while (set.contains(nums[i] + counters)) {
					counters++;
				}
				max = counters > max ? counters : max;
			}
		}
		return max;
    }
}
