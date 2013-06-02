package question;

public class MinimumPathSum {
	public int minPathSum(int[][] grid) {
		// Start typing your Java solution below
		// DO NOT write main() function
		int[] dp = new int[grid[0].length];
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (j > 0)
					dp[j] = i > 0 ? Math.min(dp[j - 1], dp[j]) : dp[j - 1];
				dp[j] += grid[i][j];
			}
		}
		return dp[grid[0].length - 1];
	}
}
