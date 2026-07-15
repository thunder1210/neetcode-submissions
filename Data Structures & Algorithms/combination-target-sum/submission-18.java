class Solution {

    private List<List<Integer>> res;

    public List<List<Integer>> combinationSum(int[] nums, int target) {
        res = new ArrayList<>();
        Arrays.sort(nums);
        backstrack(0, new ArrayList<>(), nums, target);
        return res;
    }

    public void backstrack(int index, List<Integer> list, int[] nums, int target) {
        if (target == 0) {
            res.add(new ArrayList<>(list));
            return;
        }
        if (target < 0 || index >= nums.length) {
            return;
        }
        list.add(nums[index]);
        backstrack(index, list, nums, target - nums[index]);
        list.remove(list.size() - 1);
        backstrack(index + 1, list, nums, target);
    }

}
