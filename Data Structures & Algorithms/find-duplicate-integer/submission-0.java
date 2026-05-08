class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

		for (int target : nums) {
			if (set.contains(target)) {
				return target;
			}
			set.add(target);
		}
		return 0;
    }
}
