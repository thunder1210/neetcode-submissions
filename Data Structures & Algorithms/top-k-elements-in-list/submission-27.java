class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<int[]> q = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            q.offer(new int[] {entry.getKey(), entry.getValue()});
            if (q.size() > k) {
                q.poll();
            }
        }

        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = q.poll()[0];
        }
        return res;
    }
}
