class Solution {
    public int[] twoSum(int[] nums, int target) {
       Map<Integer, Integer> resultMap = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			if (resultMap.get(target - nums[i]) != null) {
				return new int[] { resultMap.get(target - nums[i]), i  };
			} else {
				resultMap.put(nums[i], i);
			}
		}
		return null;
    }
}
