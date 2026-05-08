class Solution {
    public boolean isAnagram(String s, String t) {
if (s.length() != t.length()) {
			return false;
		}
		char[] sArray = s.toCharArray();
		char[] tArray = t.toCharArray();

		Map<Character, Integer> sResult = new HashMap<>();
		Map<Character, Integer> tResult = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			sResult.put(sArray[i], sResult.getOrDefault(sArray[i], 0) + 1);
			tResult.put(tArray[i], tResult.getOrDefault(tArray[i], 0) + 1);
		}
		return sResult.equals(tResult);
    }
}
