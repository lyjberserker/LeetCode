package question;

import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacters {
	public int lengthOfLongestSubstring(String s) {
		// Start typing your Java solution below
		// DO NOT write main() function
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		int max = 0;
		int len = 0;
		for (int i = 0; i < s.length(); i++, len++) {
			if (map.containsKey(s.charAt(i))) {
				max = Math.max(len, max);
				len = 0;
				i = map.get(s.charAt(i)) + 1;
				map.clear();
			}
			map.put(s.charAt(i), i);
		}
		return Math.max(max, len);
	}
}
