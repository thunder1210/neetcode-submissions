class PrefixTree {

	private Map<String, List<String>> map;

	public PrefixTree() {
		this.map = new HashMap<>();
		
		String[] letters = new String[26];
		for (int i = 0; i < 26; i++) {
		    letters[i] = String.valueOf((char) ('a' + i));
		    map.put(letters[i], new ArrayList<>());
		}
	}

	public void insert(String word) {
		String firstWord = String.valueOf(word.charAt(0));
		List<String> targetList = this.map.get(firstWord);
		targetList.add(word);
		map.put(firstWord, targetList);
	}

	public boolean search(String word) {
		String firstWord = String.valueOf(word.charAt(0));
		List<String> targetList = this.map.get(firstWord);
		return targetList.contains(word);

	}

	public boolean startsWith(String prefix) {
		String firstWord = String.valueOf(prefix.charAt(0));
		List<String> targetList = this.map.get(firstWord);
		for (String target : targetList) {
			if (target.length() < prefix.length()) {
				continue;
			}
			if (target.contains(prefix)) {
				return true;
			}
		}
		return false;

	}
}
