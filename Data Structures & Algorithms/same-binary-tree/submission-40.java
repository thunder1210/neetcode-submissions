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
    public boolean isSameTree(TreeNode p, TreeNode q) {
		if (p == null && q == null) return true;
        if (p == null || q == null) return false;

		Queue<TreeNode> l = new LinkedList<>();
		l.offer(p);
		l.offer(q);

		while (!l.isEmpty()) {
			TreeNode left = l.poll();
			TreeNode right = l.poll();

			if (left.val != right.val) {
				return false;
			}
			if (left.left != null && right.left != null) {
				l.offer(left.left);
				l.offer(right.left);
			} else if (left.left != null || right.left != null) {
				return false;
			}

			if (left.right != null && right.right != null) {
				l.offer(left.right);
				l.offer(right.right);
			} else if (left.right != null || right.right != null) {
				return false;
			}
		}
		return true;
    }
}