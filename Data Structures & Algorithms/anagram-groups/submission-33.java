class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
		List<List<String>> res = new ArrayList<>();
		Map<String, List<String>> map = new HashMap<>();

		for (String s : strs) {
			char[] arr = s.toCharArray();
			Arrays.sort(arr);

			String tmp = new String(arr);
			if (map.containsKey(tmp)) {
				map.get(tmp).add(s);
			} else {
				List<String> l = new ArrayList<>();
				l.add(s);
				map.put(tmp, l);
			}
		}

		for (Map.Entry<String, List<String>> m : map.entrySet()) {
			List<String> list = m.getValue();
			res.add(list);
		}
        return res;
    }
}
