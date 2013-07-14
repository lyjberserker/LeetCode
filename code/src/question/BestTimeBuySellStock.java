package question;

public class BestTimeBuySellStock {
	public int maxProfit(int[] prices) {
		// Start typing your Java solution below
		// DO NOT write main() function
		int max = 0;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < prices.length; i++) {
			if (prices[i] < min)
				min = prices[i];
			int tmp = prices[i] - min;
			if (tmp > max)
				max = tmp;
		}
		return max;
	}
}
