package question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class FourSum {
	public ArrayList<ArrayList<Integer>> fourSum(int[] num, int target) {
		// Start typing your Java solution below
		// DO NOT write main() function
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		Arrays.sort(num);
		HashSet<ArrayList<Integer>> set = new HashSet<ArrayList<Integer>>();
		for (int i = 0; i < num.length - 3; i++) {
			for (int j = i + 1; j < num.length - 2; j++) {
				int k = j + 1;
				int l = num.length - 1;
				while (k < l) {
					int tmp = num[i] + num[j] + num[k] + num[l];
					if (tmp == target) {
						ArrayList<Integer> ans = new ArrayList<Integer>();
						ans.add(num[i]);
						ans.add(num[j]);
						ans.add(num[k]);
						ans.add(num[l]);
						if (set.add(ans))
							res.add(ans);
						k++;
						l--;
					}
					if (tmp > target)
						l--;
					else
						k++;
				}
			}
		}
		return res;
	}
}
