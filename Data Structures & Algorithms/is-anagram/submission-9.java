class Solution {
    public boolean isAnagram(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		Map<Character, Integer> sResult = new HashMap<>();
		Map<Character, Integer> tResult = new HashMap<>();

		for (int i = 0; i < s.length(); i ++) {
			sResult.put(s.charAt(i), sResult.getOrDefault(s.charAt(i), 0) +1);
			tResult.put(t.charAt(i), tResult.getOrDefault(t.charAt(i), 0) + 1);
		}
		return sResult.equals(tResult);
    }
}
