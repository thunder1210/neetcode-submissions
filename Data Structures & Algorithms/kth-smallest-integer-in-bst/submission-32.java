
class Solution {
    public int kthSmallest(TreeNode root, int k) {
        PriorityQueue<Integer> res = new PriorityQueue<>((a, b) -> b - a);
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            TreeNode cur = q.poll();
            if (cur != null) {
                res.offer(cur.val);
                q.offer(cur.left);
                q.offer(cur.right);

                if (res.size() > k) {
                    res.poll();
                }
            }
        }
        return res.poll();
    }
}
