package question;

import java.util.ArrayList;

public class Permutations {
	public ArrayList<ArrayList<Integer>> permute(int[] num) {
		// Start typing your Java solution below
		// DO NOT write main() function
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> ans = new ArrayList<Integer>();
		int[] visited = new int[num.length];
		permute(res, ans, num, visited, 0);
		return res;
	}

	public void permute(ArrayList<ArrayList<Integer>> res,
			ArrayList<Integer> ans, int[] num, int[] visited, int step) {
		if (step == num.length) {
			res.add(ans);
			return;
		}
		for (int i = 0; i < num.length; i++) {
			if (visited[i] == 0) {
				visited[i] = 1;
				ans.add(num[i]);
				permute(res, new ArrayList<Integer>(ans), num, visited,
						step + 1);
				visited[i] = 0;
				ans.remove(ans.size() - 1);
			}
		}
	}
}
