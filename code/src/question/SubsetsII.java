package question;

import java.util.ArrayList;
import java.util.Arrays;

public class SubsetsII {
	public ArrayList<ArrayList<Integer>> subsetsWithDup(int[] num) {
		// Start typing your Java solution below
		// DO NOT write main() function
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> ans = new ArrayList<Integer>();
		Arrays.sort(num);
		res.add(ans);
		subsetsWithDup(res, ans, num, 0);
		return res;
	}

	public void subsetsWithDup(ArrayList<ArrayList<Integer>> res,
			ArrayList<Integer> ans, int[] num, int step) {
		for (int i = step; i < num.length; i++) {
			ans.add(num[i]);
			res.add(new ArrayList<Integer>(ans));
			subsetsWithDup(res, ans, num, i + 1);
			ans.remove(ans.size() - 1);
			while (i < num.length - 1 && num[i] == num[i + 1])
				i++;
		}
	}

}
