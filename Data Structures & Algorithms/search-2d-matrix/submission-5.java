class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int matrixLeft = 0;
		int matrixRight = matrix.length - 1;
		while (matrixLeft <= matrixRight) {
			int half = (matrixLeft + matrixRight) / 2;
			int[] halfArray = matrix[half];

			if (target >= halfArray[0] && target <= halfArray[halfArray.length - 1]) {
				matrixLeft = half;
				matrixRight = half;
				break;
			} else if (target < halfArray[0]) {
				matrixRight = half - 1;
			} else {
				matrixLeft = half + 1;
			}
		}
		int[] possibleArray = matrix[(matrixLeft + matrixRight) / 2];
		for (int i = possibleArray.length - 1; i >= 0; i--) {
			if (possibleArray[i] == target) {
				return true;
			}
		}
		return false;
    }
}
