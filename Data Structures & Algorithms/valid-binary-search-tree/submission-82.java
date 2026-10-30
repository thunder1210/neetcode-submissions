
class Solution {
    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;
        return validate(root, null, null);
    }

    public boolean validate (TreeNode node, Integer min, Integer max) {
        if (node == null) return true;
        if (min != null && node.val <= min) return false;
        if (max != null && node.val >= max) return false;

        return validate(node.left, min, node.val) && validate(node.right, node.val, max);
    }
}
