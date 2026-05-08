class Solution {
    public boolean isValidSudoku(char[][] q) {
        // check rows
		for (int i = 0; i < q.length; i++) {
			Set<Character> rows = new HashSet<>();
			for (int j = 0; j < q[i].length; j++) {
				if (q[i][j] != '.' && rows.contains(q[i][j])) {
					return false;
				} else {
					rows.add(q[i][j]);
				}
			}
		}
		
		// check columns
		for (int i = 0; i < q.length; i++) {
			Set<Character> col = new HashSet<>();
			for (int j = 0; j < q.length; j++) {
				if (q[j][i] != '.' && col.contains(q[j][i])) {
					return false;
				} else {
					col.add(q[j][i]);
				}
			}
		}
		
		for (int square = 0; square < 9; square++) {
            Set<Character> seen = new HashSet<>();
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    int row = (square / 3) * 3 + i;
                    int col = (square % 3) * 3 + j;
                    if (q[row][col] == '.') continue;
                    if (seen.contains(q[row][col])) return false;
                    seen.add(q[row][col]);
                }
            }
        }
		return true;
    }
}
