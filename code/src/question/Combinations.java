package question;

import java.util.ArrayList;

public class Combinations {
	public ArrayList<ArrayList<Integer>> combine(int n, int k) {
		// Start typing your Java solution below
		// DO NOT write main() function
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> ans = new ArrayList<Integer>();
		combine(n, res, ans, k, 1);
		return res;
	}

	public void combine(int n, ArrayList<ArrayList<Integer>> res,
			ArrayList<Integer> ans, int k, int level) {
		if (ans.size() == k) {
			res.add(new ArrayList<Integer>(ans));
			return;
		}
		for (int i = level; i <= n; i++) {
			ans.add(i);
			combine(n, res, ans, k, i + 1);
			ans.remove(ans.size() - 1);
		}
	}
}
