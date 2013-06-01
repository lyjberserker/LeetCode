package question;

import java.util.Stack;

public class ValidParentheses {
	public boolean isValid(String s) {
		// Start typing your Java solution below
		// DO NOT write main() function
		Stack<Character> st = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[')
				st.push(s.charAt(i));
			else {
				if (st.isEmpty())
					return false;
				else if (s.charAt(i) == ')' && st.peek() != '(')
					return false;
				else if (s.charAt(i) == ']' && st.peek() != '[')
					return false;
				else if (s.charAt(i) == '}' && st.peek() != '{')
					return false;
				st.pop();
			}
		}
		return st.isEmpty();
	}
}
