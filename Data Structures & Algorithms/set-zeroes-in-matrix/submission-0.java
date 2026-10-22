
class Solution {
    public void setZeroes(int[][] matrix) {

        // Zero wali rows store karega
        HashSet<Integer> rows = new HashSet<>();

        // Zero wale columns store karega
        HashSet<Integer> cols = new HashSet<>();

        int m = matrix.length;
        int n = matrix[0].length;

        // Step 1: Jahan 0 mile uski row aur column store karo
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (matrix[i][j] == 0) {
                    rows.add(i);
                    cols.add(j);
                }
            }
        }

        // Step 2: Stored rows ko 0 bana do
        for (int row : rows) {

            for (int j = 0; j < n; j++) {
                matrix[row][j] = 0;
            }
        }

        // Step 3: Stored columns ko 0 bana do
        for (int col : cols) {

            for (int i = 0; i < m; i++) {
                matrix[i][col] = 0;
            }
        }
    }
}