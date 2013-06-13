package question;

public class TrappingRainWater {
	public int trap(int[] A) {
		// Start typing your Java solution below
		// DO NOT write main() function
		int res = 0;
		if (A.length < 3)
			return res;
		int[] maxL = new int[A.length - 2];
		int[] maxR = new int[A.length - 2];
		int max = A[0];
		for (int i = 0; i < A.length - 2; i++) {
			maxL[i] = max;
			if (A[i + 1] > max)
				max = A[i + 1];
		}
		max = A[A.length - 1];
		for (int i = A.length - 3; i >= 0; i--) {
			maxR[i] = max;
			int tmp = Math.min(maxR[i], maxL[i]) - A[i + 1];
			if (tmp > 0)
				res += tmp;
			if (A[i + 1] > max)
				max = A[i + 1];
		}
		return res;
	}
}
