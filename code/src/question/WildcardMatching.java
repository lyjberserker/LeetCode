package question;

public class WildcardMatching {
	public boolean isMatch(String s, String p) {
		// Start typing your Java solution below
		// DO NOT write main() function
		int i = 0;
		int j = 0;
		int star = -1;
		int pre = 0;
		while (i < s.length()) {
			while (j < p.length() && p.charAt(j) == '*') {
				star = j++;
				pre = i;
			}
			if (j == p.length()
					|| (p.charAt(j) != '?' && p.charAt(j) != s.charAt(i))) {
				if (star >= 0) {
					j = star + 1;
					i = ++pre;
				} else
					return false;
			} else {
				j++;
				i++;
			}
		}
		while (j < p.length() && p.charAt(j) == '*')
			j++;
		return j == p.length();
	}
}
