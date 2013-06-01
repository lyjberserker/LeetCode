package question;

import java.util.Stack;

public class LongestValidParentheses {
	public int longestValidParentheses(String s) {
		// Start typing your Java solution below
		// DO NOT write main() function
		Stack<Integer> st = new Stack<Integer>();
		int len = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(')
				st.push(i);
			else if (!st.isEmpty() && s.charAt(st.peek()) == '(') {
				st.pop();
				len = Math.max(len, i - (st.isEmpty() ? -1 : st.peek()));
			} else
				st.push(i);
		}
		return len;
	}
}
