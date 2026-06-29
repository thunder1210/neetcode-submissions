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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
		Queue<TreeNode> q = new LinkedList<>();
		q.offer(root);

		while (!q.isEmpty()) {
			List<Integer> list = new ArrayList<>();
			int s = q.size();
			for (int i = 0; i < s; i++) {
				TreeNode t = q.poll();
				if (t != null) {
					list.add(t.val);
				if (t.left != null) q.offer(t.left);
                if (t.right != null) q.offer(t.right);
				}
			}
			if (list.size() > 0) {
				res.add(list);
			}
		}
		return res;
    }
}
