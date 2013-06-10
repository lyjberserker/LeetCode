package question;

public class StringInteger {
	public int atoi(String str) {
		// Start typing your Java solution below
		// DO NOT write main() function
		int index = 0;
		while (index < str.length() && str.charAt(index) == ' ')
			index++;
		int sign = 1;
		if (index < str.length() && str.charAt(index) == '-') {
			sign = -1;
			index++;
		} else if (index < str.length() && str.charAt(index) == '+')
			index++;
		double res = 0;
		while (index++ < str.length() && Character.isDigit(str.charAt(index)))
			res = res * 10 + str.charAt(index) - '0';
		if (sign == 1 && res >= Integer.MAX_VALUE)
			return Integer.MAX_VALUE;
		if (sign == -1 && res >= (Integer.MAX_VALUE + 1.0))
			return Integer.MIN_VALUE;
		return sign * (int) res;
	}
}
