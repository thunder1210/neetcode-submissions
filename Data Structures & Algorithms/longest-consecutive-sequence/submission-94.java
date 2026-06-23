class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);
        }
        int max = 0;
        int count = 0;

        for (int n : set) {
            int cur = 0;
            int p = 0;
            if (!set.contains(n - 1)) {
                while (set.contains(n + p)) {
                    cur++;
                    p++;
                }
            }
            if (cur > count) {
                max = n; 
                count = cur;
            }
        }
        return count;
    }
}
