class Solution {
    public boolean exist(char[][] board, String word) {
        char[] arr = word.toCharArray();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (dfs(board, arr, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean dfs(char[][] board, char[] arr, int i, int j, int counter) {
        if (counter == arr.length) return true;
        if (i < 0 || j < 0 || i >= board.length || j >= board[i].length
                || board[i][j] != arr[counter]) {
            return false;
        }

        char temp = board[i][j];
        board[i][j] = '#';

        boolean res = dfs(board, arr, i + 1, j, counter + 1)
                    || dfs(board, arr, i - 1, j, counter + 1)
                    || dfs(board, arr, i, j + 1, counter + 1)
                    || dfs(board, arr, i, j - 1, counter + 1);

        board[i][j] = temp;
        return res;
    }
}
