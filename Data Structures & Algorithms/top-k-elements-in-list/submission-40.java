class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] res = new int[k];
        Map<Integer, Integer> map = new HashMap<>();
        PriorityQueue<int[]> q = new PriorityQueue<>((a, b) -> a[0] - b[0]);

        for (int i = 0; i < nums.length; i++) { 
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            int count = m.getValue();
            int num = m.getKey();
            q.offer(new int[] {count, num});

            if (q.size() > k) q.poll();
        }

        int index = 0;
        while (!q.isEmpty()) {
            int[] tmp = q.poll();
            res[index] = tmp[1];
            index++;
        }
        return res; 
    }
}
