class Solution {
    		public static boolean isAnagram(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		char[] sList = new char[s.length()];
		char[] tList = new char[t.length()];

		for (int i = 0; i < s.length(); i++) {
			sList[i] = s.charAt(i);
			tList[i] = t.charAt(i);
		}
		Arrays.sort(sList);
		Arrays.sort(tList);
		return Arrays.equals(sList, tList);
	}
}
