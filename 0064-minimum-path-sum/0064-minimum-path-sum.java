import java.util.Arrays;

class Solution {
    static int dp[][];

    public int minPathSum(int[][] grid) {
        int x = grid.length;
        int y = grid[0].length;
        dp = new int[x][y];

        for (int[] arr : dp)
            Arrays.fill(arr, -1);
        
        return path(grid, x - 1, y - 1);
    }

    static int path(int[][] arr, int i, int j) {
        if (i == 0 && j == 0) {
            return arr[0][0];
        }

        if (i < 0 || j < 0) {
            return Integer.MAX_VALUE;
        }

        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        int fromTop = path(arr, i - 1, j);
        int fromLeft = path(arr, i, j - 1);

        dp[i][j] = arr[i][j] + Math.min(fromTop, fromLeft);

        return dp[i][j];
    }
}
