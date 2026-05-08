class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
		String str = "";
		int maxLength = 0;

		for (int i = 0; i < s.length(); i++) {
			int index = str.indexOf(s.charAt(i));

			if (index == -1) {
				str += s.charAt(i);
			} else {
				left += index + 1;
				str = s.substring(left, i + 1);
			}
			maxLength = Math.max(maxLength, str.length());
		}
		return maxLength;
    }
}
