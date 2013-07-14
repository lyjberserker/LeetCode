package question;

import java.util.ArrayList;
import java.util.Arrays;

public class CombinationSumII {
	public ArrayList<ArrayList<Integer>> combinationSum2(int[] candidates,
			int target) {
		// Start typing your Java solution below
		// DO NOT write main() function
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> ans = new ArrayList<Integer>();
		Arrays.sort(candidates);
		combinationSum2(candidates, res, ans, target, 0);
		return res;
	}

	public void combinationSum2(int[] candidates,
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
			combinationSum2(candidates, res, ans, target - candidates[i], i + 1);
			ans.remove(ans.size() - 1);
			while (i < candidates.length - 1
					&& candidates[i] == candidates[i + 1])
				i++;
		}
	}
}
