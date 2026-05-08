class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
		Arrays.sort(nums);

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				int current = nums[i] + nums[j];
				for (int t = 0; t < nums.length; t++) {
					if (t == i || t == j) {
						continue;
					}
					if ((current + nums[t]) == 0) {
						ArrayList<Integer> tempList = new ArrayList<>();
						tempList.add(nums[i]);
						tempList.add(nums[j]);
						tempList.add(nums[t]);
						tempList.sort(Integer::compareTo);
						if (!result.contains(tempList)) {
							result.add(tempList);
						}
					}
				}
			}
		}
		return result;
    }
}
