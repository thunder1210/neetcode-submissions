class Solution {
    public int longestConsecutive(int[] nums) {
        int maximum = 0;
		int currentMax = 0;
		if (nums.length == 0 || nums == null) {
			return maximum;
		}
		Arrays.sort(nums);

		System.out.println(Arrays.toString(nums));
		for (int i = 0; i < nums.length - 1; i++) {
			if ((nums[i + 1] - 1) == nums[i]) {
				currentMax++;
			} else if (nums[i + 1] == nums[i]) {
				continue;
			} else {
				maximum = Math.max(currentMax, maximum);
				currentMax = 0;
			}
		}
		int result = Math.max(maximum, currentMax) + 1;
		return result;
    }
}
