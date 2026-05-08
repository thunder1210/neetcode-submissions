class Solution {
    public int[] twoSum(int[] numbers, int target) {
        boolean ans = false;

		int start = 0;
		int end = numbers.length - 1;

		while (ans == false) {
//			System.out.println("現在比: " + numbers[start] + ", 和end: " + numbers[end]);
			if (numbers[start] + numbers[end] == target) {
				int[] result = new int[] { end + 1, start + 1 };
				Arrays.sort(result);
				return result;
			}
			if (end == 0) {
				start++;
				end = numbers.length - 1;
			}
			if (start > numbers.length) {
				break;
			}
			end--;
		}
		return null;
    }
}
