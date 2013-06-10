package question;

import java.util.ArrayList;
import java.util.Arrays;

public class Subsets {
	public ArrayList<ArrayList<Integer>> subsets(int[] S) {
		// Start typing your Java solution below
		// DO NOT write main() function
		ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		Arrays.sort(S);
		int max = 1 << S.length;
		for (int i = 0; i < max; i++) {
			ArrayList<Integer> ans = new ArrayList<Integer>();
			int k = i;
			int index = 0;
			while (k > 0) {
				if ((k & 1) > 0)
					ans.add(S[index]);
				k >>= 1;
				index++;
			}
			res.add(ans);
		}
		return res;
	}
}
