package question;

public class BestTimeBuySellStockIII {
	public int maxProfit(int[] prices) {
		// Start typing your Java solution below
		// DO NOT write main() function
		int ans = 0;
		int[] dp = new int[prices.length + 1];
		int compare = Integer.MAX_VALUE;
		for (int i = 0; i < prices.length; i++) {
			if (prices[i] < compare)
				compare = prices[i];
			dp[i] = prices[i] - compare;
		}
		compare = 0;
		int max = 0;
		for (int i = prices.length - 1; i >= 0; i--) {
			if (prices[i] > compare)
				compare = prices[i];
			int tmp = compare - prices[i];
			if (tmp > max)
				max = tmp;
			tmp = max + dp[i];
			if (tmp > ans)
				ans = tmp;
		}
		return ans;
	}
}
