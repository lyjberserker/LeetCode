package question;

public class PlusOne {
	public int[] plusOne(int[] digits) {
		// Start typing your Java solution below
		// DO NOT write main() function
		int carry = 1;
		for (int i = digits.length - 1; i >= 0; i--) {
			int value = digits[i] + carry;
			carry = value / 10;
			digits[i] = value % 10;
		}
		if (carry == 0)
			return digits;
		int[] res = new int[digits.length + 1];
		res[0] = 1;
		for (int i = 0; i < digits.length; i++)
			res[i + 1] = digits[i];
		return res;
	}
}
