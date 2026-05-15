class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {
		if (strs == null) return null;
		
		Map<String, List<String>> map = new HashMap<>();

		for (String s : strs) {
			char[] temp = s.toCharArray();
			Arrays.sort(temp);
			String key = String.valueOf(temp);
			if (!map.containsKey(key)) {
				map.put(key, new ArrayList<>(List.of(s)));
			} else {
				map.get(key).add(s);
			}
		}
		List<List<String>> result = new ArrayList<>();
		result.addAll(map.values());
		return result;
    }
}
