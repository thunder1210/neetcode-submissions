class Solution {
    public int longestConsecutive(int[] nums) {
        int max = 0;

        Map<Integer, Integer> map = new HashMap<>();
        int left = 0;
        int right = nums.length;

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        while (left < right) {
            int tmp = nums[left];
            if (!map.containsKey(tmp - 1)) {
                int count = 1;
                while (map.containsKey(tmp + count)) {
                    count++;
                } 
                max = Math.max(count, max);
            } 
            left++;
        }
        return max;
    }
}
