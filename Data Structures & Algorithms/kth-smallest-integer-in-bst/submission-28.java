
class Solution {
    public int kthSmallest(TreeNode root, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<>((a, b) -> b - a);
        dfs(q, root, k);
        return q.peek();
    }

    public void dfs(PriorityQueue<Integer> q, TreeNode root, int k) {
        if (root == null) return;
        q.offer(root.val);
        if (q.size() > k) {
            q.poll();
        }
        dfs(q, root.left, k);
        dfs(q, root.right, k);
    }
}
