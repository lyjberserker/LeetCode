package question;

public class RomanInteger {
	public int romanToInt(String s) {
		// Start typing your Java solution below
		// DO NOT write main() function
		int res = 0;
		for (int i = 0; i < s.length(); i++) {
			if (i > 0 && getInt(s.charAt(i)) > getInt(s.charAt(i - 1)))
				res += (getInt(s.charAt(i)) - 2 * getInt(s.charAt(i - 1)));
			else
				res += getInt(s.charAt(i));
		}
		return res;
	}

	public int getInt(char c) {
		switch (c) {
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'L':
			return 50;
		case 'C':
			return 100;
		case 'D':
			return 500;
		case 'M':
			return 1000;
		default:
			return 0;
		}
	}
}
