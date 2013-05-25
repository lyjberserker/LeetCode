package question;

public class ClimbingStairs {
	public int climbStairs(int n) {
		// Start typing your Java solution below
		// DO NOT write main() function
		int n0 = 1;
		int n1 = 1;
		for (int i = 0; i < n; i++) {
			int tmp = n1;
			n1 = n0 + n1;
			n0 = tmp;
		}
		return n0;
	}
}
