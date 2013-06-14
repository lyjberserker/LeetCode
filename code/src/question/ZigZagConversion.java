package question;

public class ZigZagConversion {
	public String convert(String s, int nRows) {
		// Start typing your Java solution below
		// DO NOT write main() function
		if (nRows <= 1)
			return s;
		String res = "";
		for (int i = 0; i < nRows; i++)
			for (int j = 0, index = i; index < s.length(); j++, index = (2 * nRows - 2)
					* j + i) {
				res += s.charAt(index);
				if (i != 0 && i != nRows - 1)
					if (index + (nRows - i - 1) * 2 < s.length())
						res += s.charAt(index + (nRows - i - 1) * 2);
			}
		return res;
	}
}
