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
        if (root == null) {
            return res;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty()) {
            List<Integer> cur = new ArrayList<>();
            for (int i = q.size(); i > 0; i --) {
                TreeNode n = q.poll();
                if (n != null) {
                    cur.add(n.val);
                    q.offer(n.left);
                    q.offer(n.right);
                }
            }
            if (cur.size() > 0) {
                res.add(cur);
            }
        }
        return res;
    }
}
