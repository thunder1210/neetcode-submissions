class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < numbers.length; i++) {
			if (map.get(numbers[i]) != null && numbers[map.get(numbers[i])] != numbers[i]) {
				return new int[] { map.get(numbers[i]) + 1, i + 1 };
			} else {
				map.put(target - numbers[i], i);
			}
		}
		return null;
    }
}
