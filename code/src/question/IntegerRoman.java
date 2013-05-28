package question;

public class IntegerRoman {
	public String intToRoman(int num) {
		// Start typing your Java solution below
		// DO NOT write main() function
		int div = 1000;
		String s = "";
		for (int i = 0; i < 4; i++) {
			s = getRoman(num / div, s, 6 - 2 * i);
			num %= div;
			div /= 10;
		}
		return s;
	}

	public String getRoman(int num, String s, int level) {
		char[] symbol = { 'I', 'V', 'X', 'L', 'C', 'D', 'M' };
		if (num == 0)
			return s;
		else if (num <= 3)
			for (int i = 0; i < num; i++)
				s += symbol[level];
		else if (num == 4) {
			s += symbol[level];
			s += symbol[level + 1];
		} else if (num <= 8) {
			s += symbol[level + 1];
			for (int i = 0; i < num - 5; i++)
				s += symbol[level];
		} else {
			s += symbol[level];
			s += symbol[level + 2];
		}
		return s;
	}
}
