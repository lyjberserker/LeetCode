package question;

public class MinimumWindowSubstring {
	public String minWindow(String S, String T) {
		// Start typing your Java solution below
		// DO NOT write main() function
		String res = "";
		char[] tMap = new char[256];
		char[] sMap = new char[256];
		for (int i = 0; i < T.length(); i++)
			tMap[T.charAt(i)]++;
		int start = 0;
		int count = 0;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < S.length(); i++) {
			if (tMap[S.charAt(i)] == 0)
				continue;
			sMap[S.charAt(i)]++;
			if (sMap[S.charAt(i)] <= tMap[S.charAt(i)])
				count++;
			if (count == T.length()) {
				while (tMap[S.charAt(start)] == 0
						|| sMap[S.charAt(start)] > tMap[S.charAt(start)]) {
					if (sMap[S.charAt(start)] > tMap[S.charAt(start)])
						sMap[S.charAt(start)]--;
					start++;
				}
				if (min > i - start + 1) {
					min = i - start + 1;
					res = S.substring(start, i + 1);
				}
			}
		}
		return res;
	}
}
