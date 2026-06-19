class Solution {
    
    List<List<Integer>> res;

    public List<List<Integer>> combinationSum(int[] nums, int target) {
        res = new ArrayList<List<Integer>>();
        List<Integer> cur = new ArrayList<>();
        calculate(nums, target, cur, 0);
        return res;
    }

    public void calculate(int[] nums, int target, List<Integer> cur, int count) {
        if (target == 0) {
            res.add(new ArrayList(cur));
            return;
        }
        if (target < 0 || count >= nums.length) {
            return;
        }
        cur.add(nums[count]);
        calculate(nums, target - nums[count], cur, count);
        cur.remove(cur.size() - 1);
        calculate(nums, target, cur, count + 1);
    }
}
