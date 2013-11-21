package question;

import java.util.ArrayList;

public class LongestDescendingSubSequence {
	public static void main(String[] args) {
		int[] a = { 9, 4, 3, 2, 5, 4, 3, 2, 1, 0 };
		ArrayList<Integer> ans = longestDescendingSubSequence(a);
		for (int i : ans)
			System.out.println(i);
	}

	public static ArrayList<Integer> longestDescendingSubSequence(int[] a) {
		int[] dp = new int[a.length];
		ArrayList<Integer> res = new ArrayList<>();
		for (int i = 0; i < a.length; i++) {
			dp[i] = 1;
			for (int j = 0; j < i; j++) {
				if (a[j] > a[i] && dp[j] + 1 > dp[i]) {
					dp[i] = dp[j] + 1;
					if (res.isEmpty())
						res.add(a[j]);
					if (!res.contains(a[i]))
						res.add(a[i]);
				}
			}
		}
		return res;
	}

}
