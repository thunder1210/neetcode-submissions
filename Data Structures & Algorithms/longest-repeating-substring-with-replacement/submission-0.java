class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
		int maxCount = 0;
		int maxLength = 0;
		char[] q = s.toCharArray();
		Map<Character, Integer> map = new HashMap<>();

		for (int right = 0; right < s.length(); right++) {
			map.put(q[right], map.getOrDefault(q[right], 0) + 1);
			maxCount = Math.max(maxCount, map.get(q[right]));
			while ((right - left + 1) - maxCount > k) {
				map.put(q[left], map.get(q[left]) - 1);
				left++;
			}
			maxLength = Math.max(maxLength, right - left + 1);
		}
		return maxLength;
    }
}
