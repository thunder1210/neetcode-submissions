class Solution {
    public int longestConsecutive(int[] nums) {
		Set<Integer> set = new HashSet<>();
		int result = 0;

		for (int i : nums) {
			set.add(i);
		}

		for (int i = 0; i < nums.length; i++) {
			int counter = 1;
			if (!set.contains(nums[i] - 1)) {
				while (set.contains(nums[i] + counter)) {
					counter++;
				}
				result = Math.max(counter, result);
			}
		}
        return result;
    }
}
