package question;

import java.util.ArrayList;

public class PalindromePartitioning {
	public ArrayList<ArrayList<String>> partition(String s) {
		// Start typing your Java solution below
		// DO NOT write main() function
		ArrayList<ArrayList<String>> res = new ArrayList<ArrayList<String>>();
		ArrayList<String> ans = new ArrayList<String>();
		partition(res, ans, 0, s);
		return res;
	}

	public void partition(ArrayList<ArrayList<String>> res,
			ArrayList<String> ans, int step, String s) {
		if (step == s.length()) {
			res.add(new ArrayList<String>(ans));
			return;
		}
		for (int i = step; i < s.length(); i++)
			if (isPalindrome(s, step, i)) {
				ans.add(s.substring(step, i + 1));
				partition(res, ans, i + 1, s);
				ans.remove(ans.size() - 1);
			}
	}

	public boolean isPalindrome(String s, int b, int e) {
		while (b < e)
			if (s.charAt(b++) != s.charAt(e--))
				return false;
		return true;
	}
}
