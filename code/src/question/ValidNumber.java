package question;

public class ValidNumber {
	public boolean isNumber(String s) {
		// Start typing your Java solution below
		// DO NOT write main() function
		int i = 0;
		while (i < s.length() && s.charAt(i) == ' ')
			i++;
		boolean isNumber = false;
		boolean aSpace = true;
		boolean aE = false;
		boolean aDot = true;
		boolean aSign = true;
		boolean aNumber = true;
		boolean aE1 = true;
		while (i < s.length()) {
			char c = s.charAt(i);
			if (Character.isDigit(c) && aNumber) {
				isNumber = true;
				aE = true;
				aSign = false;
			} else if ((c == '+' || c == '-') && aSign)
				aSign = false;
			else if (c == '.' && aDot) {
				aDot = false;
				aSign = false;
			} else if (c == 'e' && aE && aE1) {
				aE = false;
				aE1 = false;
				aDot = false;
				aSign = true;
				isNumber = false;
			} else if (c == ' ' && aSpace) {
				aNumber = false;
				aDot = false;
			} else
				return false;
			i++;
		}
		return isNumber;
	}
}
