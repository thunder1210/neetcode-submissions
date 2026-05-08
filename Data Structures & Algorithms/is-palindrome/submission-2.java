class Solution {
    public boolean isPalindrome(String s) {
        if (s == null || s.equals("")) {
			return false;
		}
		String cleanStr = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		char[] arr = cleanStr.toCharArray();
		double half = arr.length / 2;

		int left = 0;
		int right = arr.length - 1;

		while (left < half) {
			if (arr[left] != arr[right]) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
}
