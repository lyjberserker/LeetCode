package question;

import java.util.ArrayList;

public class GenerateParentheses {
	public ArrayList<String> generateParenthesis(int n) {
		// Start typing your Java solution below
		// DO NOT write main() function
		ArrayList<String> res = new ArrayList<String>();
		generateParenthesis(res, "", 2 * n, 0);
		return res;
	}

	public void generateParenthesis(ArrayList<String> res, String tmp, int n,
			int val) {
		// Start typing your Java solution below
		// DO NOT write main() function
		if (n == 0 && val == 0) {
			res.add(tmp);
			return;
		}
		if (n < 0 || val < 0)
			return;
		generateParenthesis(res, tmp + "(", n - 1, val + 1);
		generateParenthesis(res, tmp + ")", n - 1, val - 1);
	}
}
