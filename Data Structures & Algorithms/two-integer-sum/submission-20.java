class Solution {

    public int[] twoSum(int[] nums, int target) {
		if (nums == null) {
			return null;
		}
		
		Map<Integer, Integer> compareMap = new HashMap<>();
		
		for (int i = 0; i < nums.length; i++) {
			if (compareMap.containsKey(target - nums[i])) {
				return new int[] {compareMap.get(target - nums[i]), i};
			} else {
				compareMap.put(nums[i], i);
			}
		}
		return null;
    }
}
