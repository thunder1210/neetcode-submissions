class TrieNode {
    TrieNode[] children;
    boolean isEndWord;

    public TrieNode() {
        children = new TrieNode[26];
        isEndWord = false;
    }
}

class WordDictionary {

    private TrieNode root;

    public WordDictionary() {
        root = new TrieNode();
    }

    public void addWord(String word) {
        TrieNode cur = root;
        for (char c : word.toCharArray()) {
            int i = c - 'a';
            if (cur.children[i] == null) {
                cur.children[i] = new TrieNode();
            } 
            cur = cur.children[i];
        }
        cur.isEndWord = true;
    }

    public boolean search(String word) {
        return dfs(word, root, 0);
    }

    public boolean dfs(String word, TrieNode root, int count) {
        TrieNode cur = root;
        for (int i = count; i < word.length(); i++) {
            char c = word.charAt(i);
            if (c == '.') {
                for (TrieNode child : cur.children) {
                    if (child != null && dfs(word, child, count + 1)) {
                        return true;
                    }
                }
                return false;
            } else {
                int n = c - 'a';
                if (cur.children[n] == null) {
                    return false;
                }
                return dfs(word, cur.children[n], count + 1);
            }
        }
        return cur.isEndWord;
    }
}
