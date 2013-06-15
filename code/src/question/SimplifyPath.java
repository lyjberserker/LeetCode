package question;

import java.util.Stack;

public class SimplifyPath {
	public String simplifyPath(String path) {
		// Start typing your Java solution below
		// DO NOT write main() function
		Stack<String> stack = new Stack<String>();
		int i = 0;
		while (i < path.length()) {
			while (i < path.length() && path.charAt(i) == '/')
				i++;
			int j = i;
			while (i < path.length() && path.charAt(i) != '/')
				i++;
			String s = path.substring(j, i);
			if (s.equals("..")) {
				if (!stack.isEmpty())
					stack.pop();
			} else if (!s.equals(".") && s.length() > 0)
				stack.push(s);
		}
		String res = "";
		for (String s : stack)
			res += "/" + s;
		if (res.length() == 0)
			res = "/";
		return res;
	}
}
