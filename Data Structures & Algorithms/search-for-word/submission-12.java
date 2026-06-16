class Solution {
    public boolean exist(char[][] board, String word) {
        char[] target = word.toCharArray();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == target[0] && dfs(board, i, j, 0, target)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean dfs(char[][] board, int i, int j, int counter, char[] target) {
        if (counter == target.length) {
            return true;
        }
        if (i < 0 || j < 0 || i >= board.length || j >= board[i].length
            || board[i][j] != target[counter]) {
            return false;
        }
        char temp = board[i][j];
        board[i][j] = '#';

        boolean result = dfs(board, i + 1, j, counter + 1, target)
							|| dfs(board, i - 1, j, counter + 1, target)
							|| dfs(board, i, j + 1, counter + 1, target)
							|| dfs(board, i, j - 1, counter + 1, target);

        board[i][j] = temp;
        return result;
    }
}
