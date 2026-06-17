class Solution {
    private List<List<Integer>> res;
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        res = new ArrayList<List<Integer>>();
        List<Integer> cur = new ArrayList<>();
        backstrack(nums, target, cur, 0);
        return res;
    }

    public void backstrack(int[] nums, int target, List<Integer> cur, int counter) {
        if (target == 0) {
            res.add(new ArrayList(cur));
            return;
        }
        if (target < 0 || counter >= nums.length) {
            return;
        }
        cur.add(nums[counter]);
        backstrack(nums, target - nums[counter], cur, counter);
        cur.remove(cur.size() - 1);
        backstrack(nums, target, cur, counter + 1);
    } 
}
