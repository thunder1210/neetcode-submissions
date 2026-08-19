class Solution {
    public int numIslands(char[][] grid) { 
        int counter = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    counter++;
                    calculate(grid, i, j);
                } else {
                    continue;
                }
            }
        }
        return counter;
    }

    public void calculate(char[][] grid, int row, int column) {
        if (row < 0 || row >= grid.length || column < 0 
                || column >= grid[row].length || grid[row][column] == '0') {
            return;
        }
        grid[row][column] = '0';

        calculate(grid, row - 1, column);
        calculate(grid, row + 1, column);
        calculate(grid, row, column + 1);
        calculate(grid, row, column - 1);
    }
}
