class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length <= 0) {
			return 0;
		}
		int highestCounter = 0, currentCounter = 1;
		Arrays.sort(nums);

		for (int i = 0; i < nums.length; i++) {
			if (i == 0 || nums[i] == nums[i - 1]) {
				continue;
			}
			if ((nums[i - 1] + 1) == nums[i]) {
				currentCounter++;
			} else {
				highestCounter = currentCounter > highestCounter ? currentCounter : highestCounter;
				currentCounter = 1;
			}
		}
		highestCounter = currentCounter > highestCounter ? currentCounter : highestCounter;
		return highestCounter;
    }
}
