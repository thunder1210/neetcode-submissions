class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
		Map<String, List<String>> result = new HashMap<>();

		for (String s : strs) {
			char[] arr = s.toCharArray();
			Arrays.sort(arr);
			String sortedString = new String(arr);
			result.putIfAbsent(sortedString, new ArrayList<>());
			result.get(sortedString).add(s);
		}
		return new ArrayList<>(result.values());
	}
}
