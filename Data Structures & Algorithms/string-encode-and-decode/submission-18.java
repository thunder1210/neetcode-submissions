class Solution {

    public String encode(List<String> strs) {
		StringBuilder sb = new StringBuilder();
		for (String s : strs) {
			sb.append(s);
			sb.append(";");
		}
		return sb.toString();
    }

    public List<String> decode(String str) {
		List<String> reuslt = new ArrayList<>();
    	
    	char[] arr = str.toCharArray();
    	int start = 0;
    	int end = 0;
    	int count = 0;
    	
		for (int i = 0; i < str.length(); i++) {
			if (arr[i] == ';') {
				end = start + count;
				reuslt.add(str.substring(start, end));
				start = end + 1;
				count = 0;
			} else {
				count++;
			}
		}
		return reuslt;
    }
}
