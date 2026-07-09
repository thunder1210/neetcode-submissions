class Solution {
    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == word.charAt(0)) {
                    if (dfs(board, 0, i, j, word)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean dfs(char[][] board, int position, int i, int j, String word) {
        if (i >= board.length || i < 0
            || j >= board[i].length || j < 0 || board[i][j] != word.charAt(position)) {
            return false;
        } 
        if (position == word.length() - 1) {
            return true;
        }
        char temp = board[i][j]; 
        board[i][j] = '#';
        position++;
        boolean res = dfs(board, position, i + 1, j, word) ||
                      dfs(board, position, i - 1, j, word) ||
                      dfs(board, position, i, j + 1, word) ||
                      dfs(board, position, i, j - 1, word);

        board[i][j] = temp;
        return res;
    }
}
