package question;

public class DistinctSubsequences {
	public int numDistinct(String S, String T) {
		// Start typing your Java solution below
		// DO NOT write main() function
		int[] dp = new int[T.length() + 1];
		dp[0] = 1;
		for (int i = 0; i < S.length(); i++)
			for (int j = T.length() - 1; j >= 0; j--)
				if (S.charAt(i) == T.charAt(j))
					dp[j + 1] += dp[j];
		return dp[T.length()];
	}
}
