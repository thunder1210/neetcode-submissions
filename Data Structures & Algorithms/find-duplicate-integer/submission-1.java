class Solution {
    public int findDuplicate(int[] nums) {
        int slow = 0;
		int fast = slow + 1;
		Arrays.sort(nums);

		while (fast < nums.length) {
			if (nums[slow] == nums[fast]) {
				return nums[slow];
			}
			slow++;
			fast++;
		}
		return 0;
    }
}
