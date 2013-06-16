package question;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class WordLadderII {
	public ArrayList<ArrayList<String>> findLadders(String start, String end,
			HashSet<String> dict) {
		ArrayList<ArrayList<String>> res = new ArrayList<ArrayList<String>>();
		HashMap<String, HashSet<String>> graph = new HashMap<String, HashSet<String>>();
		dict.add(start);
		dict.add(end);
		for (String str : dict)
			createGraph(graph, str, dict);
		ArrayList<String> ans = new ArrayList<String>();
		ans.add(start);
		Queue<ArrayList<String>> q = new LinkedList<ArrayList<String>>();
		q.add(ans);
		int length = 1;
		boolean found = false;
		HashMap<String, Integer> visited = new HashMap<String, Integer>();
		while (!q.isEmpty()) {
			ans = q.poll();
			if (ans.size() > length) {
				if (found)
					break;
				else
					length++;
			}
			String now = ans.get(ans.size() - 1);
			HashSet<String> set = graph.get(now);
			if (set == null || set.isEmpty())
				continue;
			ArrayList<String> remove = new ArrayList<String>();
			for (String str : set) {
				if (str.equals(end)) {
					found = true;
					ans.add(end);
					res.add(ans);
					continue;
				}
				if (visited.containsKey(str)) {
					int oldLength = visited.get(str);
					if (ans.size() > oldLength) {
						remove.add(str);
						continue;
					}
				}
				visited.put(str, ans.size());
				ArrayList<String> next = new ArrayList<String>(ans);
				next.add(str);
				q.add(next);
			}
			for (String s : remove)
				set.remove(s);
		}
		return res;
	}

	void createGraph(HashMap<String, HashSet<String>> graph, String str,
			HashSet<String> dict) {
		char[] c = str.toCharArray();
		for (int i = 0; i < c.length; i++) {
			char tmp = c[i];
			for (char j = 'a'; j <= 'z'; j++) {
				if (tmp == j)
					continue;
				c[i] = j;
				String s = new String(c);
				if (dict.contains(s)) {
					HashSet<String> set = graph.get(str);
					if (set != null)
						set.add(s);
					else {
						set = new HashSet<String>();
						set.add(s);
						graph.put(str, set);
					}
				}
			}
			c[i] = tmp;
		}
	}
}
