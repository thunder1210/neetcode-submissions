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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        // 如果大樹走到底了，代表沒找到相符的起點
        if (root == null) {
            return false;
        }
        
        // 你的邏輯：只有當第一個數字相符時 (root.val == subRoot.val)，才啟動向下比對 (isSameTree)
        if (root.val == subRoot.val && isSameTree(root, subRoot)) {
            return true;
        }
        
        // 如果數字不相符，或是比對後發現不對，就繼續往左、右子樹尋找下一個相符的起點
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    // 輔助方法：嚴格判斷兩棵樹是否 100% 完全相同
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // 兩個都是 null，代表結構相同
        if (p == null && q == null) {
            return true;
        }
        // 其中一個是 null 或者值不相等，代表不同
        if (p == null || q == null || p.val != q.val) {
            return false;
        }
        // 目前節點過關，繼續嚴格檢查左、右分支是否也完全相同
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
