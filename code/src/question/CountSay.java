package question;

public class CountSay {
	public String countAndSay(int n) {
		// Start typing your Java solution below
		// DO NOT write main() function
		String s = "1-";
		int i = 1;
		while (i < n) {
			String tmp = "";
			int count = 0;
			char last = s.charAt(0);
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(j) == last)
					count++;
				else {
					tmp = tmp + String.valueOf(count) + last;
					last = s.charAt(j);
					count = 1;
				}
			}
			s = tmp + "-";
			i++;
		}
		return s.substring(0, s.length() - 1);
	}
}
