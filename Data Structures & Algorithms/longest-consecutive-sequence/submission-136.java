class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length < 1) return 0;

        int res = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i : nums) {
            map.put(i, i);
        }
        for (int i = 0; i < nums.length; i++) {
            int cur = nums[i]; 
            if (!map.containsKey(cur - 1)) {
                int count = 1;
                while (map.containsKey(cur + 1)) {
                    count++;
                    cur++;
                }
                res = Math.max(res, count);
            }
        }
        return res;
    }
}
