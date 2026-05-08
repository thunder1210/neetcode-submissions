class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int[] current : matrix) {
			int lastIndex = current.length - 1;
			if (current[lastIndex] < target) {
				continue;
			}
			for (int i = lastIndex; i >= 0; i--) {
				if (current[i] == target) {
					return true;
				}
			}
		}
		return false;
    }
}
