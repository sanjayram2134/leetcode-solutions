import java.util.Arrays;

class Solution {
    public int uniquePathsWithObstacles(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int dp[][] = new int[m][n];
        
        // If the starting cell has an obstacle, return 0
        if (grid[0][0] == 1) {
            return 0;
        }
        
        // Initialize the dp array
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = -1;
            }
        }
        

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    dp[i][j] = 0; 
                } else if (i == 0 && j == 0) {
                    dp[i][j] = 1; // Starting cell
                } else {
                    int up = (i > 0) ? dp[i - 1][j] : 0;
                    int left = (j > 0) ? dp[i][j - 1] : 0;
                    dp[i][j] = up + left;
                }
            }
        }
        
        return dp[m - 1][n - 1];
    }
}
