package question;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class WordLadder {
	public int ladderLength(String start, String end, HashSet<String> dict) {
		// Start typing your Java solution below
		// DO NOT write main() function
		Queue<String> q = new LinkedList<String>();
		Queue<Integer> qDis = new LinkedList<Integer>();
		q.add(start);
		qDis.add(1);
		while (!q.isEmpty()) {
			char[] c = q.poll().toCharArray();
			int dis = qDis.poll();
			for (int i = 0; i < c.length; i++) {
				char tmp = c[i];
				for (char j = 'a'; j <= 'z'; j++) {
					if (tmp == j)
						continue;
					c[i] = j;
					String s = new String(c);
					if (s.equals(end))
						return dis + 1;
					if (dict.contains(s)) {
						q.add(s);
						qDis.add(dis + 1);
						dict.remove(s);
					}
				}
				c[i] = tmp;
			}
		}
		return 0;
	}

	public int ladderLength2(String start, String end, HashSet<String> dict) {
		Set<String> set = new HashSet<String>();
		Queue<String> q = new LinkedList<String>();
		set.add(start);
		q.add(start);
		int dis = 1;
		int size = 1;
		while (size > 0) {
			while (size-- > 0) {
				char[] c = q.poll().toCharArray();
				for (int i = 0; i < c.length; i++) {
					char tmp = c[i];
					for (char j = 'a'; j <= 'z'; j++) {
						if (tmp == j)
							continue;
						c[i] = j;
						String s = new String(c);
						if (s.equals(end))
							return dis + 1;
						if (dict.contains(s) && !set.contains(s)) {
							q.add(s);
							set.add(s);
						}
					}
					c[i] = tmp;
				}
			}
			dis++;
			size = q.size();
		}
		return 0;
	}
}
