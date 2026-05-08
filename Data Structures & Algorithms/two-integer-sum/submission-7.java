class Solution {
    public int[] twoSum(int[] nums, int target) {
		if (nums == null) {
			return null;
		}
		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			if (map.get((target - nums[i])) != null) {
				return new int[] { map.get(target - nums[i]), i };
			}
			map.put(nums[i], i);
		}
		return null;
	}
}
