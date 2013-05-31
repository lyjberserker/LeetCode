package question;

public class LengthLastWord {
	public int lengthOfLastWord(String s) {
		// Start typing your Java solution below
		// DO NOT write main() function
		int i = s.length();
		int len = 0;
		while (--i >= 0)
			if (s.charAt(i) != ' ')
				break;
		while (i >= 0) {
			if (s.charAt(i) != ' ')
				len++;
			else
				break;
			i--;
		}
		return len;
	}
}
