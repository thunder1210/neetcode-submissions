class Solution {

    private List<List<Integer>> res;

    public List<List<Integer>> threeSum(int[] nums) {
        res = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue; // 跳過重複的 i
            backtrack(nums, i, i + 1, nums.length - 1);
        }
        return res;
    }

    public void backtrack(int[] nums, int i, int j, int k) {
        while (j < k) {
            int sub = nums[i] + nums[j] + nums[k];
            if (sub == 0) {
                res.add(List.of(nums[i], nums[j], nums[k]));
                while (j < k && nums[j] == nums[j + 1]) j++; // 跳過重複的 j
                while (j < k && nums[k] == nums[k - 1]) k--; // 跳過重複的 k
                j++;
                k--;
            } else if (sub > 0) {
                k--;
            } else {
                j++;
            }
        }
    }
}