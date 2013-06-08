package question;

import java.util.ArrayList;

public class PascalTriangleII {
	public ArrayList<Integer> getRow(int rowIndex) {
		// Start typing your Java solution below
		// DO NOT write main() function
		ArrayList<Integer> res = new ArrayList<Integer>();
		int[] dp = new int[rowIndex + 2];
		dp[1] = 1;
		for (int i = 0; i < rowIndex; i++)
			for (int j = rowIndex + 1; j > 0; j--)
				dp[j] = dp[j - 1] + dp[j];
		for (int i = 1; i < dp.length; i++)
			res.add(dp[i]);
		return res;
	}
}
