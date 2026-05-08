class Solution {
    public String minWindow(String s, String t) {
        Map<Character, Integer> target = new HashMap<>();
		for (char c : t.toCharArray())
			target.put(c, target.getOrDefault(c, 0) + 1);

		Map<Character, Integer> window = new HashMap<>();
		int left = 0, count = 0, minLen = Integer.MAX_VALUE;
		String result = "";

		for (int right = 0; right < s.length(); right++) {
			char c = s.charAt(right);
			window.put(c, window.getOrDefault(c, 0) + 1);

			// 如果這個字元是目標，且窗口內的數量還沒達標，增加 count
			if (target.containsKey(c) && window.get(c) <= target.get(c)) {
				count++;
			}
			// 當湊齊了（count == t.length），開始「縮小」
			while (count == t.length()) {
				// 更新目前最短紀錄
				if (right - left + 1 < minLen) {
					minLen = right - left + 1;
					result = s.substring(left, right + 1);
				}
				// 開始移動左邊界 (這就是你的縮小邏輯)
				char leftChar = s.charAt(left);
				window.put(leftChar, window.get(leftChar) - 1);

				// 如果丟掉的字元是必要的，且丟完後低於目標數量，count 減少
				if (target.containsKey(leftChar) && window.get(leftChar) < target.get(leftChar)) {
					count--;
				}
				left++; // 真正的縮小：移動左指標
			}
		}
		return result;
    }
}
