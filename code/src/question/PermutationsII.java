package question;

import java.util.ArrayList;
import java.util.Arrays;

public class PermutationsII {
	public ArrayList<ArrayList<Integer>> permuteUnique(int[] num) {
		// Start typing your Java solution below
		// DO NOT write main() function
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> ans = new ArrayList<Integer>();
		int[] visited = new int[num.length];
		Arrays.sort(num);
		permuteUnique(res, ans, num, visited, 0);
		return res;
	}

	public void permuteUnique(ArrayList<ArrayList<Integer>> res,
			ArrayList<Integer> ans, int[] num, int[] visited, int step) {
		if (step == num.length) {
			res.add(ans);
			return;
		}
		for (int i = 0; i < num.length; i++) {
			if (visited[i] == 0) {
				visited[i] = 1;
				ans.add(num[i]);
				permuteUnique(res, new ArrayList<Integer>(ans), num, visited,
						step + 1);
				visited[i] = 0;
				ans.remove(ans.size() - 1);
				while (i < num.length - 1 && num[i] == num[i + 1])
					i++;
			}
		}
	}
}
