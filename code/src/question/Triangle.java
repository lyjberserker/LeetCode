package question;

import java.util.ArrayList;

public class Triangle {
	public int minimumTotal(ArrayList<ArrayList<Integer>> triangle) {
		// Start typing your Java solution below
		// DO NOT write main() function
		int m = triangle.size();
		if (m == 0)
			return 0;
		int[] dp = new int[triangle.get(m - 1).size()];
		for (int i = m - 1; i >= 0; i--) {
			int n = triangle.get(i).size();
			for (int j = 0; j < n; j++) {
				if (i == m - 1)
					dp[j] = triangle.get(i).get(j);
				else
					dp[j] = Math.min(dp[j], dp[j + 1]) + triangle.get(i).get(j);
			}
		}
		return dp[0];
	}
}
