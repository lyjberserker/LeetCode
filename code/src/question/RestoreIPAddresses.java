package question;

import java.util.ArrayList;

public class RestoreIPAddresses {
	public ArrayList<String> restoreIpAddresses(String s) {
		// Start typing your Java solution below
		// DO NOT write main() function
		ArrayList<String> res = new ArrayList<String>();
		restoreIpAddresses(res, s, 0, "", 0);
		return res;
	}

	public void restoreIpAddresses(ArrayList<String> res, String s, int index,
			String ans, int step) {
		if (s.length() - index > (4 - step) * 3
				|| s.length() - index < 4 - step)
			return;
		if (s.length() == index && step == 4) {
			ans = ans.substring(0, ans.length() - 1);
			res.add(ans);
			return;
		}
		int num = 0;
		for (int i = index; i < index + 3 && i < s.length(); i++) {
			num = num * 10 + s.charAt(i) - '0';
			if (num <= 255) {
				ans += s.charAt(i);
				restoreIpAddresses(res, s, i + 1, ans + '.', step + 1);
			}
			if (num == 0)
				break;
		}
	}
}
