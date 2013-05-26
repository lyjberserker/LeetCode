package question;

public class DecodeWays {
	public int numDecodings(String s) {
		// Start typing your Java solution below
		// DO NOT write main() function
		if (s.length() == 0)
			return 0;
		if (s.length() == 1)
			return checkOne(s.charAt(0));
		int f1 = checkOne(s.charAt(0));
		int f2 = checkOne(s.charAt(0)) * checkOne(s.charAt(1))
				+ checkTwo(s.charAt(0), s.charAt(1));
		for (int i = 2; i < s.length(); i++) {
			int fn = 0;
			if (checkOne(s.charAt(i)) != 0)
				fn += f2;
			if (checkTwo(s.charAt(i - 1), s.charAt(i)) != 0)
				fn += f1;
			if (fn == 0)
				return 0;
			f1 = f2;
			f2 = fn;
		}
		return f2;
	}

	public int checkOne(char a) {
		return a != '0' ? 1 : 0;
	}

	public int checkTwo(char a, char b) {
		return (a == '1' || (a == '2' && b <= '6')) ? 1 : 0;
	}
}
