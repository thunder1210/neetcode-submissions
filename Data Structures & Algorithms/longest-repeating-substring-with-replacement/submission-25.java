class Solution {
    public static int characterReplacement(String s, int k) {
		Map<Character, Integer> map = new HashMap<>();
		int res = 0;
		int left = 0;
		int maxf = 0;
		
		for (int right = 0; right < s.length(); right++) {
			map.put(s.charAt(right), map.getOrDefault(s.charAt(right), 0) + 1);
			maxf = Math.max(maxf, map.get(s.charAt(right)));
			
			while (right - left + 1 - maxf > k) {
				char leftChar = s.charAt(left);
                map.put(leftChar, map.get(leftChar) - 1);
				left++;
			}
			res = Math.max(res, right - left + 1);
		}
		return res;
	}
}
