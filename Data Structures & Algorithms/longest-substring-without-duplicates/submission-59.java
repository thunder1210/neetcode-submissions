class Solution {
    public int lengthOfLongestSubstring(String s) {
        int res = 0;
        char[] cr = s.toCharArray();

        for (int i = 0; i < cr.length; i++) {
            Set<Character> set = new HashSet<>();
            set.add(cr[i]);
            int counter = 1;
            int tempMax = 1;
            while ((i + counter) < cr.length) {
                if (!set.contains(cr[i + counter])) {
                    set.add(cr[i + counter]);
                    tempMax++;
                    counter++;
                } else {
                    break;
                }
            }
            res = Math.max(res, tempMax);
        }
        return res;
    }
}
