package question;

public class PalindromePartitioningII {
	public int minCut(String s) {
		// Start typing your Java solution below
		// DO NOT write main() function
		int[] dp = new int[s.length() + 1];
		boolean[][] ip = new boolean[s.length() + 1][s.length() + 1];
		for (int i = 0; i <= s.length(); i++)
			dp[i] = s.length() - i;
		for (int i = s.length() - 1; i >= 0; i--)
			for (int j = i; j < s.length(); j++)
				if (s.charAt(i) == s.charAt(j)
						&& (j - i < 2 || ip[i + 1][j - 1])) {
					ip[i][j] = true;
					dp[i] = Math.min(dp[i], 1 + dp[j + 1]);
				}
		return dp[0] - 1;
	}
}
