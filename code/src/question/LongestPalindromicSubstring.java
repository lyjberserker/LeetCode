package question;

public class LongestPalindromicSubstring {
	public String longestPalindrome(String s) {
		// Start typing your Java solution below
		// DO NOT write main() function
		boolean[][] b = new boolean[s.length()][s.length()];
		int start = 0;
		int max = 1;
		for (int i = 0; i < s.length(); i++)
			b[i][i] = true;
		for (int i = 0; i < s.length() - 1; i++)
			if (s.charAt(i) == s.charAt(i + 1)) {
				b[i][i + 1] = true;
				start = i;
				max = 2;
			}
		for (int len = 3; len <= s.length(); len++)
			for (int i = 0; i < s.length() - len + 1; i++) {
				int j = i + len - 1;
				if (s.charAt(i) == s.charAt(j) && b[i + 1][j - 1]) {
					b[i][j] = true;
					start = i;
					max = len;
				}
			}
		return s.substring(start, start + max);
	}
}
