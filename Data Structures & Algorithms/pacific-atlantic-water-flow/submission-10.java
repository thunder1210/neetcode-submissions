class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();

        if (heights == null || heights.length == 0) {
            return res;
        }
        int m = heights.length;
        int n = heights[0].length;

        boolean[][] alt = new boolean[m][n];
        boolean[][] pac = new boolean[m][n];
        
        for (int i = 0; i < m; i++) {
            dfs(heights, pac, Integer.MIN_VALUE, i, 0);
            dfs(heights, alt, Integer.MIN_VALUE, i, n - 1);
        }

        for (int j = 0; j < n; j++) {
            dfs(heights, pac, Integer.MIN_VALUE, 0, j);
            dfs(heights, alt, Integer.MIN_VALUE, m - 1, j);
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (alt[i][j] && pac[i][j]) {
                    res.add(Arrays.asList(i, j));
                }
            }
        }
        return res;
    }

    public void dfs(int[][] heights, boolean[][] visited, int pre, int i, int j) {
        if (i < 0 || j < 0 || i >= heights.length || j >= heights[0].length) {
            return;
        }
        if (visited[i][j] == true) {
            return;
        }
        if (heights[i][j] < pre) {
            return;
        }
        visited[i][j] = true;
        dfs(heights, visited, heights[i][j], i + 1, j);
        dfs(heights, visited, heights[i][j], i - 1, j);
        dfs(heights, visited, heights[i][j], i, j + 1);
        dfs(heights, visited, heights[i][j], i, j - 1);
    }
}
