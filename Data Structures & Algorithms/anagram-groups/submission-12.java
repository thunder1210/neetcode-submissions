class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {
		Map<String, List<String>> map = new HashMap<>();

		for (String s : strs) {
			char[] temp = s.toCharArray();
			Arrays.sort(temp);
			if (!map.containsKey(String.valueOf(temp))) {
				map.put(String.valueOf(temp), new ArrayList<>(List.of(s)));
			} else {
				map.get(String.valueOf(temp)).add(s);
			}
		}
		List<List<String>> result = new ArrayList<>();
		result.addAll(map.values());
		return result;
    }
}
