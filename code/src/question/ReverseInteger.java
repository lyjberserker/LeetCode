package question;

public class ReverseInteger {
	public int reverse(int x) {
		// Start typing your Java solution below
		// DO NOT write main() function
		int num = 0;
		int c = 0;
		while (x != 0) {
			c = x % 10;
			num = num * 10 + c;
			x /= 10;
		}
		return num;
	}
}
