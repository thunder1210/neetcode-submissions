class Solution {
    public boolean isValidBST(TreeNode root) {
        return isBinaryTree(root, null, null);
    }

    public boolean isBinaryTree(TreeNode root, Integer min, Integer max) {
        if (root == null) return true;
        if (min != null && root.val <= min) return false;
        if (max != null && root.val >= max) return false;
        return isBinaryTree(root.left, min, root.val) && isBinaryTree(root.right, root.val, max);
    }
}