class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
		List<List<String>> res = new ArrayList<>();
		Map<String, List<String>> map = new HashMap<>();

		for (String s :strs) {
			char[] arr = s.toCharArray();
			Arrays.sort(arr);
			String sortedStr = new String(arr);
			if (map.containsKey(sortedStr)) {
				map.get(sortedStr).add(s);
			} else {
				List<String> list = new ArrayList<>();
				list.add(s);
				map.put(sortedStr, list);
			}
		}
		return new ArrayList<>(map.values());
    }
}
