
class Solution {  
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (subRoot == null) return true;
        if (root == null) return false;
        if (sameSub(root, subRoot)) return true;
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    public boolean sameSub(TreeNode root, TreeNode subRoot) {
        if (root == null && subRoot == null) return true;

        if (root == null || subRoot == null || root.val != subRoot.val) return false;

        return sameSub(root.left, subRoot.left) && sameSub(root.right, subRoot.right);
    }
}
