class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
		Stack<Integer> stack = new Stack<>();
		for (int i : temperatures)
			stack.push(i);

		for (int i = 0; i < temperatures.length - 1; i++) {
			Stack<Integer> temp = new Stack<>();
			for (int j = i + 1; j < temperatures.length; j++) {
				if (temperatures[j] <= temperatures[i]) {
					temp.push(temperatures[j]);
				} else {
					result[i] = temp.size() + 1;
					break;
				}
			}
		}
		return result;
    }
}
