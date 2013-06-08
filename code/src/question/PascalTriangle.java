package question;

import java.util.ArrayList;

public class PascalTriangle {
	public ArrayList<ArrayList<Integer>> generate(int numRows) {
		// Start typing your Java solution below
		// DO NOT write main() function
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < numRows; i++) {
			ArrayList<Integer> ans = new ArrayList<Integer>();
			ans.add(1);
			if (i > 0) {
				for (int j = 0; j < i - 1; j++)
					ans.add(res.get(i - 1).get(j) + res.get(i - 1).get(j + 1));
				ans.add(1);
			}
			res.add(ans);
		}
		return res;
	}
}
