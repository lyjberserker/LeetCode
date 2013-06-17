package question;

public class MultiplyStrings {
	public String multiply(String num1, String num2) {
		// Start typing your Java solution below
		// DO NOT write main() function
		int[] num = new int[num1.length() + num2.length()];
		for (int i = 0; i < num1.length(); i++) {
			int carry = 0;
			int a = num1.charAt(num1.length() - i - 1) - '0';
			for (int j = 0; j < num2.length(); j++) {
				int b = num2.charAt(num2.length() - j - 1) - '0';
				num[i + j] += carry + a * b;
				carry = num[i + j] / 10;
				num[i + j] %= 10;
			}
			num[i + num2.length()] = carry;
		}
		int i = num.length - 1;
		while (i > 0 && num[i] == 0)
			i--;
		StringBuffer s = new StringBuffer("");
		while (i >= 0)
			s.append((char) ('0' + num[i--]));
		return s.toString();
	}
}
