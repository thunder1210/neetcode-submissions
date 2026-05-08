/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode leftr;
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
    private static List<Integer> list = new ArrayList<>();
	
	public void collectList(TreeNode node) {
		if (node == null) {
			return;
		}
		collectList(node.left);
	    
	    // 2. 處理中間（自己）
	    list.add(node.val);
	    
	    // 3. 再去右邊（較大的）
	    collectList(node.right);
	}

	public int kthSmallest(TreeNode root, int k) {
		list.clear();
		collectList(root);
		return list.get(k - 1);
	}
}
