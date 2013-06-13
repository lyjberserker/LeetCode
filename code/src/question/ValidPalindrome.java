package question;

public class ValidPalindrome {
	public boolean isPalindrome(String s) {
		// Start typing your Java solution below
		// DO NOT write main() function
		int b = 0;
		int e = s.length() - 1;
		s = s.toLowerCase();
		while (b < e) {
			while (b < e && !Character.isLetterOrDigit(s.charAt(b)))
				b++;
			while (b < e && !Character.isLetterOrDigit(s.charAt(e)))
				e--;
			if (s.charAt(b++) != s.charAt(e--))
				return false;
		}
		return true;
	}
}
