package question;

public class JumpGame {
	public boolean canJump(int[] A) {
		// Start typing your Java solution below
		// DO NOT write main() function
		int max = 0;
		for (int i = 0; i < A.length && max >= i; i++) {
			if (A[i] + i > max)
				max = A[i] + i;
			if (max >= A.length - 1)
				return true;
		}
		return false;
	}
}
