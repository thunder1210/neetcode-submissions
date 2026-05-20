class Solution {

    public int longestConsecutive(int[] nums) {

		Set<Integer> set = new HashSet<>();
		int res = 0;

		for (int i : nums) {
			set.add(i);
		}

		for (int i = 0; i < nums.length; i++) {
			if (!set.contains(nums[i] - 1)) {
				int counter = 1;
				while (set.contains(nums[i] + counter)) {
                    counter++;
                }
				res = Math.max(res, counter);
			}
		}
		return res;
    }
}
