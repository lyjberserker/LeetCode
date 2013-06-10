package question;

public class Sqrt {
	public int sqrt(int x) {
		// Start typing your Java solution below
		// DO NOT write main() function
		double f = x;
		for (int i = 0; i < 20; i++) {
			f = (f + x / f) / 2;
		}
		return (int) f;
	}

	public int sqrt2(int x) {
		// Start typing your Java solution below
		// DO NOT write main() function
		int b = 0;
		int e = (int) (x / 2 < Math.sqrt(Integer.MAX_VALUE) ? x / 2 + 1 : Math
				.sqrt(Integer.MAX_VALUE));
		while (b <= e) {
			int mid = (b + e) / 2;
			int target = mid * mid;
			if (target == x)
				return mid;
			else if (target < x)
				b = mid + 1;
			else
				e = mid - 1;
		}
		return (b + e) / 2;
	}
}
