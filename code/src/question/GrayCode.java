package question;

import java.util.ArrayList;

public class GrayCode {
	public ArrayList<Integer> grayCode(int n) {
		// Start typing your Java solution below
		// DO NOT write main() function
		ArrayList<Integer> res = new ArrayList<Integer>();
		res.add(0);
		for (int i = 0; i < n; i++) {
			int highBit = 1 << i;
			int last = res.size() - 1;
			for (int j = last; j >= 0; j--) {
				res.add(highBit + res.get(j));
			}
		}
		return res;
	}
}
