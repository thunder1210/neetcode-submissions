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
    public boolean isValidBST(TreeNode root) {
        // 呼叫輔助函式，一開始範圍設定為長整數（Long）的最小值到最大值，避免測資有 Integer.MAX_VALUE
        return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean validate(TreeNode node, long min, long max) {
        // 空節點是合法的 BST
        if (node == null) {
            return true;
        }
        
        // 核心檢查：當前節點的值必須在 (min, max) 的嚴格範圍內
        if (node.val <= min || node.val >= max) {
            return false;
        }
        
        // 往左走：右邊界（天花板）變成當前節點的值
        // 往右走：左邊界（地板）變成當前節點的值
        return validate(node.left, min, node.val) && validate(node.right, node.val, max);
    }
}
