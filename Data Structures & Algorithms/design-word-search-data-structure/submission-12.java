class WordDictionary {

    public class TreeNode {
		TreeNode[] children;
		boolean word;

		public TreeNode() {
			children = new TreeNode[26];
			word = false;
		}
	}

	private TreeNode root;

	public WordDictionary() {
		root = new TreeNode();
	}

	public void addWord(String word) {
		TreeNode current = root;
		char[] charArray = word.toCharArray();
		for (Character c : charArray) {
			if (current.children[c - 'a'] == null) {
				current.children[c - 'a'] = new TreeNode();
			}
			current = current.children[c - 'a'];
		}
		current.word = true;
	}

	public boolean search(String word) {
		return dfs(word, 0, root);
	}

	public boolean dfs(String word, int index, TreeNode node) {
		if (index == word.length()) {
			return node.word;
		}
		char c = word.charAt(index);
		if (c == '.') {
			for (TreeNode child : node.children) {
	            if (child != null && dfs(word, index + 1, child)) {
	                return true;
	            }
	        }
		} else {
			int tempIndex = c - 'a';
			if (node.children[tempIndex] != null) {
				return dfs(word, index + 1, node.children[tempIndex]);
			}
		}
		return false;
	}
}
