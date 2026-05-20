class Solution {
    public int lengthOfLongestSubstring(String s) {
        int result = 0;

        for (int left = 0; left < s.length(); left++) {
        	Map<Character, Integer> map = new HashMap<>();
            int right = left;
            while (right < s.length()) {
                if (!map.containsKey(s.charAt(right))) {
                    map.put(s.charAt(right), 1);
             	   	right++;
                } else {
                    break;
                }
            }
			result = Math.max(result, right - left);
        }
        return result;
    }
}
