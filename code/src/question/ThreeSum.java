package question;

import java.util.ArrayList;
import java.util.Arrays;

public class ThreeSum {
	public ArrayList<ArrayList<Integer>> threeSum(int[] num) {
		// Start typing your Java solution below
		// DO NOT write main() function
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		Arrays.sort(num);
		for (int i = 0; i < num.length - 2; i++) {
			if (i == 0 || num[i] > num[i - 1]) {
				int j = i + 1;
				int k = num.length - 1;
				while (j < k) {
					int tmp = num[i] + num[j] + num[k];
					if (tmp == 0) {
						ArrayList<Integer> ans = new ArrayList<Integer>();
						ans.add(num[i]);
						ans.add(num[j]);
						ans.add(num[k]);
						res.add(ans);
						k--;
						j++;
						while (k > j && num[k] == num[k + 1])
							k--;
						while (k > j && num[j] == num[j - 1])
							j++;
					}
					if (tmp > 0)
						k--;
					else
						j++;
				}
			}
		}
		return res;
	}
}
