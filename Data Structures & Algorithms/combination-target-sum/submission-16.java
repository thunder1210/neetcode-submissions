class Solution {

    private List<List<Integer>> res;

    public List<List<Integer>> combinationSum(int[] nums, int target) {
        res = new ArrayList<>();
        backtrack(0, nums, new ArrayList<>(), target);
        return res;
    }

    public void backtrack(int i, int[] nums, List<Integer> list, int target) {
        if (target == 0) {
            res.add(new ArrayList<>(list));
            return;
        }
        if (target < 0 || i >= nums.length) {
            return;
        }
        list.add(nums[i]);
        backtrack(i, nums, list, target - nums[i]);
        list.remove(list.size() - 1);
        backtrack(i + 1, nums, list, target);
    } 
}
