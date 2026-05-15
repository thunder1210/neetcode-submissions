class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {
		Map<String, List<String>> map = new HashMap<>();

		for (String s : strs) {
			char[] temp = s.toCharArray();
			Arrays.sort(temp);
			String key = String.valueOf(temp);
			
			map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
		}
		List<List<String>> result = new ArrayList<>();
		result.addAll(map.values());
		return result;
    }
}
