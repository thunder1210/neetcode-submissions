class Solution {

    private int row;
    private int column;

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> res = new ArrayList<>();
        row = heights.length;
        column = heights[0].length;

        boolean[][] pac = new boolean[row][column];
        boolean[][] alt = new boolean[row][column];

        for (int i = 0; i < row; i++) {
            dfs(i, 0, heights, pac, Integer.MIN_VALUE);
            dfs(i, column - 1, heights, alt, Integer.MIN_VALUE);
        }   
        for (int j = 0; j < column; j++) {
            dfs(0, j, heights, pac, Integer.MIN_VALUE);
            dfs(row - 1, j, heights, alt, Integer.MIN_VALUE);
        }   

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (pac[i][j] && alt[i][j]) {
                    res.add(List.of(i, j));
                }
            }
        }
        return res;
    }

    public void dfs(int i, int j, int[][] heights, boolean[][] ocean, int prev) {
        if (i < 0 || j < 0 || i >= row || j >= column || ocean[i][j] || heights[i][j] < prev) {
            return;
        }
        ocean[i][j] = true;
        
        dfs(i + 1, j, heights, ocean, heights[i][j]);
        dfs(i, j + 1, heights, ocean, heights[i][j]);
        dfs(i - 1, j, heights, ocean, heights[i][j]);
        dfs(i, j - 1, heights, ocean, heights[i][j]);
    }
}
