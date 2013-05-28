package question;

public class ImplementStr {
	public String strStr(String haystack, String needle) {
		// Start typing your Java solution below
		// DO NOT write main() function
		int[] prefix = buildKMP(needle);
		if (needle.length() == 0)
			return haystack;
		int index = 0;
		for (int i = 0; i < haystack.length(); i++) {
			while (index > 0 && haystack.charAt(i) != needle.charAt(index))
				index = prefix[index - 1];
			if (haystack.charAt(i) == needle.charAt(index))
				index++;
			if (index == needle.length())
				return needle + haystack.substring(i + 1, haystack.length());
		}
		return null;
	}

	public int[] buildKMP(String s) {
		int[] prefix = new int[s.length()];
		int index = 0;
		for (int i = 0; i < s.length(); i++) {
			while (index > 0 && s.charAt(i) != s.charAt(index))
				index = prefix[index - 1];
			if (s.charAt(i) == s.charAt(index))
				index++;
			prefix[i] = index;
		}
		return prefix;
	}
}
