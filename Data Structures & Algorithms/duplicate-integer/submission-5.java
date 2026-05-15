class Solution {
    public boolean hasDuplicate(int[] nums) {
        if (nums == null) return false;

		Map<Integer, Integer> map = new HashMap<>();

		for (int i : nums) {
			if (map.containsKey(i)) {
				return true;
			} 
			map.put(i, i);
		}
		return false;
    }
}