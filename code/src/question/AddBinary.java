package question;

public class AddBinary {
	public String addBinary(String a, String b) {
		// Start typing your Java solution below
		// DO NOT write main() function
		String ans = "";
		int carry = 0;
		int len = a.length() > b.length() ? a.length() : b.length();
		for (int i = 0; i < len; i++) {
			int a1 = a.length() > i ? a.charAt(a.length() - i - 1) - '0' : 0;
			int b1 = b.length() > i ? b.charAt(b.length() - i - 1) - '0' : 0;
			int value = carry + a1 + b1;
			ans = value % 2 + ans;
			carry = value / 2;
		}
		if (carry == 1) {
			ans = "1" + ans;
			return ans;
		}
		return ans;
	}
}
