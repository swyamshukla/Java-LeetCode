class Solution {

    public int countSquares(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        int[][] dp = new int[row][col];
        for(int i = 0; i < row; i++){
            Arrays.fill(dp[i], -1);
        }

        int sum = 0;

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                sum += solve(matrix, i, j, dp);
            }
        }

        return sum;
    }

    int solve(int[][] matrix, int i, int j, int[][] dp) {

        // ❌ out of bounds
        if(i < 0 || j < 0) return 0;

        // ✅ already computed
        if(dp[i][j] != -1) return dp[i][j];

        // ❌ if cell is 0 → no square
        if(matrix[i][j] == 0) return dp[i][j] = 0;

        // 🔁 recursive calls
        int left = solve(matrix, i, j - 1, dp);
        int up = solve(matrix, i - 1, j, dp);
        int diag = solve(matrix, i - 1, j - 1, dp);

        // ✅ same formula as tabulation
        return dp[i][j] = 1 + Math.min(left, Math.min(up, diag));
    }
}