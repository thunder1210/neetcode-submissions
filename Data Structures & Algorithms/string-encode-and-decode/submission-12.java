class Solution {

	private static final char coma = ';';

    public String encode(List<String> strs) {
		StringBuilder builder = new StringBuilder();
		for (String s : strs) {
			builder.append(s);
			builder.append(coma);
		}
		return builder.toString();
    }

    public List<String> decode(String str) {
		List<String> result = new ArrayList<>();
		int start = 0;
		int counter = 0;

		while (counter < str.length()) {
			if (str.charAt(counter) == coma) {
				result.add(str.substring(start, counter));
				start = counter + 1;
			}
			counter++;
		}
		return result;
    }
}
