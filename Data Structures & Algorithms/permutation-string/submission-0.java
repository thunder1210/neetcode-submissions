class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int left = 0;
		char[] target = s1.toCharArray();
		Arrays.sort(target);

		while (left + s1.length() <= s2.length()) {
			CharSequence nowItem = s2.subSequence(left, left + s1.length());
			char[] charArray = nowItem.toString().toCharArray();
			Arrays.sort(charArray);
			if (Arrays.equals(target, charArray)) {
				return true;
			}
			left++;
		}
		return false;
    }
}
