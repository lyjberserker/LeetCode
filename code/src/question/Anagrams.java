package question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Anagrams {
	public ArrayList<String> anagrams(String[] strs) {
		// Start typing your Java solution below
		// DO NOT write main() function
		ArrayList<String> res = new ArrayList<String>();
		HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
		for (int i = 0; i < strs.length; i++) {
			String s = getKey(strs[i]);
			if (map.containsKey(s))
				map.get(s).add(strs[i]);
			else {
				ArrayList<String> tmp = new ArrayList<String>();
				tmp.add(strs[i]);
				map.put(s, tmp);
			}
		}
		for (ArrayList<String> a : map.values())
			if (a.size() > 1)
				res.addAll(a);
		return res;
	}

	public String getKey(String s) {
		char[] c = s.toCharArray();
		Arrays.sort(c);
		return new String(c);
	}
}
