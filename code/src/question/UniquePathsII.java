package question;

public class UniquePathsII {
	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
		// Start typing your Java solution below
		// DO NOT write main() function
		int m = obstacleGrid.length;
		if (m == 0)
			return 0;
		int n = obstacleGrid[0].length;
		int[] dp = new int[n];
		dp[0] = 1;
		for (int i = 0; i < m; i++)
			for (int j = 0; j < n; j++) {
				if (obstacleGrid[i][j] == 1)
					dp[j] = 0;
				else if (j > 0)
					dp[j] += dp[j - 1];
			}
		return dp[n - 1];
	}
}
