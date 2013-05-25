package question;

import java.util.ArrayList;
import java.util.Arrays;

public class Combinations {
	public ArrayList<ArrayList<Integer>> combinationSum(int[] candidates,
			int target) {
		// Start typing your Java solution below
		// DO NOT write main() function
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> ans = new ArrayList<Integer>();
		Arrays.sort(candidates);
		combinationSum(candidates, res, ans, target, 0);
		return res;
	}

	public void combinationSum(int[] candidates,
			ArrayList<ArrayList<Integer>> res, ArrayList<Integer> ans,
			int target, int level) {
		if (target < 0)
			return;
		if (target == 0) {
			res.add(new ArrayList<Integer>(ans));
			return;
		}
		for (int i = level; i < candidates.length; i++) {
			ans.add(candidates[i]);
			combinationSum(candidates, res, ans, target - candidates[i], i);
			ans.remove(ans.size() - 1);
		}
	}
}
