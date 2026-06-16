class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        res = new ArrayList<List<Integer>>();
        List<Integer> cur = new ArrayList<>();
        backTrack(nums, target, cur, 0);
        return res;
    }

    public void backTrack(int[] nums, int target, List<Integer> cur, int counter) {
        if (target == 0) {
            res.add(new ArrayList<>(cur));
            return;
        }
        for (int j = counter; j < nums.length; j++) {
            if (target - nums[j] < 0) {
                continue;
            }
            cur.add(nums[j]);
            backTrack(nums, target - nums[j], cur, j);
            cur.remove(cur.size() - 1);
        }
    }
}
