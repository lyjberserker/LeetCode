package question;

import java.util.ArrayList;

public class TextJustification {
	public ArrayList<String> fullJustify(String[] words, int L) {
		// Start typing your Java solution below
		// DO NOT write main() function
		ArrayList<String> res = new ArrayList<String>();
		int start = 0;
		while (start < words.length) {
			int cur = start;
			int count = words[cur].length();
			StringBuffer s = new StringBuffer(words[cur]);
			while (count <= L && cur < words.length)
				if (++cur < words.length)
					count += 1 + words[cur].length();
			if (cur < words.length) {
				count -= 1 + words[cur].length();
				cur--;
				if (cur > start) {
					int a = (L - count + cur - start) / (cur - start);
					int b = (L - count + cur - start) % (cur - start);
					for (int i = start + 1; i < start + 1 + b; i++) {
						for (int j = 0; j < a + 1; j++)
							s.append(" ");
						s.append(words[i]);
					}
					for (int i = start + 1 + b; i <= cur; i++) {
						for (int j = 0; j < a; j++)
							s.append(" ");
						s.append(words[i]);
					}
				} else
					for (int i = 0; i < L - count; i++)
						s.append(" ");
			} else {
				for (int i = start + 1; i < cur; i++) {
					s.append(" ");
					s.append(words[i]);
				}
				for (int i = 0; i < L - count; i++)
					s.append(" ");
			}
			start = cur + 1;
			res.add(s.toString());
		}
		return res;
	}
}
