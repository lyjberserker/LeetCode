package question;

public class LongestCommonPrefix {
	public String longestCommonPrefix(String[] strs) {
		// Start typing your Java solution below
		// DO NOT write main() function
		String ans = "";
		if (strs.length == 0)
			return ans;
		int index = 0;
		while (true) {
			char tmp = 0;
			if (index < strs[0].length())
				tmp = strs[0].charAt(index);
			else
				return ans;
			for (int i = 1; i < strs.length; i++)
				if (index >= strs[i].length() || strs[i].charAt(index) != tmp)
					return ans;
			ans += tmp;
			index++;
		}
	}
}
