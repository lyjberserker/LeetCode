package question;

import java.util.ArrayList;

public class LetterCombinationsPhoneNumber {
	public ArrayList<String> letterCombinations(String digits) {
		// Start typing your Java solution below
		// DO NOT write main() function
		String[] nums = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs",
				"tuv", "wxyz" };
		ArrayList<String> res = new ArrayList<String>();
		letterCombinations(res, nums, digits, "", 0);
		return res;
	}

	public void letterCombinations(ArrayList<String> res, String[] nums,
			String digits, String tmp, int level) {
		if (level == digits.length()) {
			res.add(tmp);
			return;
		}
		int curNum = digits.charAt(level) - '0';
		for (int i = 0; i < nums[curNum].length(); i++) {
			tmp += nums[curNum].charAt(i);
			letterCombinations(res, nums, digits, tmp, level + 1);
			tmp = tmp.substring(0, tmp.length() - 1);
		}
	}
}
