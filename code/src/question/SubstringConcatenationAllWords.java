package question;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SubstringConcatenationAllWords {
	public ArrayList<Integer> findSubstring2(String S, String[] L) {
		// Start typing your Java solution below
		// DO NOT write main() function
		ArrayList<Integer> res = new ArrayList<Integer>();
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < L.length; i++) {
			if (map.containsKey(L[i]))
				map.put(L[i], map.get(L[i]) + 1);
			else
				map.put(L[i], 1);
		}
		for (int i = 0; S.length() - i >= L.length * L[0].length(); i++) {
			Map<String, Integer> tmp = new HashMap<String, Integer>(map);
			for (int j = 0; j < L.length; j++) {
				String s = S.substring(i + j * L[0].length(), i + (j + 1)
						* L[0].length());
				if (tmp.containsKey(s)) {
					if (tmp.get(s) == 1)
						tmp.remove(s);
					else
						tmp.put(s, tmp.get(s) - 1);
				} else
					break;
			}
			if (tmp.isEmpty())
				res.add(i);
		}
		return res;
	}
}
