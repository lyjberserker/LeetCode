package question;

public class LengthLastWord {
	public int lengthOfLastWord(String s) {
		// Start typing your Java solution below
		// DO NOT write main() function
		int i = s.length();
		int len = 0;
		while (--i >= 0 && s.charAt(i) == ' ')
			;
		while (i >= 0 && s.charAt(i--) != ' ')
			len++;
		return len;
	}
}
