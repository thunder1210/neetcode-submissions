class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        backstrack(res, new ArrayList<>(), nums, target, 0, 0);
        return res;
    }

    public void backstrack(List<List<Integer>> res, List<Integer> tmp, 
                          int[] nums, int target, int sum, int start) {
        if (sum == target) {
            res.add(new ArrayList<>(tmp));
            return;
        } else if (sum > target) {
            return;
        }
        for (int i = start; i < nums.length; i++) {
            if (nums[i] > target) continue;
            tmp.add(nums[i]);
            backstrack(res, tmp, nums, target, sum + nums[i], i);
            tmp.remove(tmp.size() - 1);
        }
    }
}
