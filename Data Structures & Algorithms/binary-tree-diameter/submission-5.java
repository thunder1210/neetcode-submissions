/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    int maxPathLength = 0;
	
	public int diameterOfBinaryTree(TreeNode root) {
		calculateResult(root);
		return maxPathLength;
	}

	public int calculateResult(TreeNode root) {
		if (root == null) return 0;
		int left = calculateResult(root.left);
		int right = calculateResult(root.right);
		maxPathLength = Math.max(maxPathLength, (left + right));
		return Math.max(left, right) + 1;
	}
}
