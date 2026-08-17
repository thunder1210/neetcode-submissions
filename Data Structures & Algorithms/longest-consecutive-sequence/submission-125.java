class Solution {
    public int longestConsecutive(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int res = 0;
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int num = nums[left];
            if (!map.containsKey(num)) {
                map.put(num, left);

                int count = 1;
                int start = num;
                while (map.containsKey(start - 1)) {
                    start--;
                    count++;
                }
                start = num;
                while (map.containsKey(start + 1)) {
                    count++;
                    start++;
                }
                res = Math.max(res, count);
            }
            left++;
        }
        return res;
    }
}