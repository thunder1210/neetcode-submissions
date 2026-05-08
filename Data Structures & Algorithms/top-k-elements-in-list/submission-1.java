class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
		int[] result = new int[k];

		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
		}

		PriorityQueue<Integer> minHeap = new PriorityQueue<>((n1, n2) -> map.get(n1) - map.get(n2));

		for (Integer targetKey : map.keySet()) {
			minHeap.add(targetKey);
			if (minHeap.size() > k) {
				minHeap.poll();
			}
		}

		for (int i = 0; i < k; i++) {
			result[i] = minHeap.poll();
		}
		return result;
    }
}
