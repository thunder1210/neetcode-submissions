class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> map = new HashMap<>();
        int left = 0;
        int res = 0;
        int max = 0;

        for (int r = 0; r < s.length(); r++) {
            map.put(s.charAt(r), map.getOrDefault(s.charAt(r), 0) + 1);
            max = Math.max(max, map.get(s.charAt(r)));
            while ((r - left + 1) - max > k)  {
                map.put(s.charAt(left), map.get(s.charAt(left)) - 1);
                left++;
            }
            res = Math.max(res, r - left + 1);
        }
        return res;
    }
}
