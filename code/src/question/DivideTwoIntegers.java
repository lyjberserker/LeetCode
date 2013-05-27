package question;

public class DivideTwoIntegers {
	public int divide(int dividend, int divisor) {
		// Start typing your Java solution below
		// DO NOT write main() function
		long de = dividend;
		long ds = divisor;
		int s = 1;
		if (de < 0) {
			de = -de;
			s = -s;
		}
		if (ds < 0) {
			ds = -ds;
			s = -s;
		}
		int index = 0;
		while (ds <= de) {
			index++;
			ds <<= 1;
		}
		int res = 0;
		while (index >= 0) {
			if (de >= ds) {
				res += 1 << index;
				de -= ds;
			}
			ds >>= 1;
			index--;
		}
		if (s < 0)
			return -res;
		return res;
	}
}
