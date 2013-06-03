package question;

import java.util.HashSet;

public class LongestConsecutiveSequence {
	public int longestConsecutive(int[] num) {
		// Start typing your Java solution below
		// DO NOT write main() function
		HashSet<Integer> set = new HashSet<Integer>();
		for (int i : num)
			set.add(i);
		int len = 0;
		for (int i : num)
			if (set.contains(i))
				len = Math.max(len,
						getLen(set, i, false) + getLen(set, i + 1, true));
		return len;
	}

	private int getLen(HashSet<Integer> set, int i, boolean b) {
		// TODO Auto-generated method stub
		int len = 0;
		while (set.contains(i)) {
			set.remove(i);
			len++;
			if (b)
				i++;
			else
				i--;
		}
		return len;
	}
}
