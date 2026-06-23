class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
		res[0] = 1;

		for (int i = 1; i < nums.length; i++) {
			res[i] = res[i - 1] * nums[i - 1];
		}

		int prefix = 1;
		for (int j = nums.length - 1; j >= 0; j--) {
			res[j] *= prefix;
			prefix *= nums[j];
		}
		return res;
    }
}  
