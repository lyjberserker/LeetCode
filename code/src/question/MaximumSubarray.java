package question;

public class MaximumSubarray {
	private int maxV;

	public int maxSubArray(int[] A) {
		// Start typing your Java solution below
		// DO NOT write main() function
		int max = Integer.MIN_VALUE;
		int tmp = 0;
		for (int i = 0; i < A.length; i++) {
			if (tmp < 0)
				tmp = 0;
			tmp += A[i];
			if (tmp > max)
				max = tmp;
		}
		return max;
	}

	public int maxSubArray2(int[] A) {
		// Start typing your Java solution below
		// DO NOT write main() function
		maxV = Integer.MIN_VALUE;
		maxSub(A, 0, A.length - 1);
		return maxV;
	}

	public int maxSub(int[] A, int b, int e) {
		// Start typing your Java solution below
		// DO NOT write main() function
		if (b > e)
			return Integer.MIN_VALUE;
		int mid = (b + e) / 2;
		int left = maxSub(A, b, mid - 1);
		int right = maxSub(A, mid + 1, e);
		maxV = Math.max(maxV, Math.max(left, right));
		int tmp = 0;
		int leftMax = 0;
		for (int i = mid - 1; i >= b; i--) {
			tmp += A[i];
			if (tmp > leftMax)
				leftMax = tmp;
		}
		tmp = 0;
		int rightMax = 0;
		for (int i = mid + 1; i <= e; i++) {
			tmp += A[i];
			if (tmp > rightMax)
				rightMax = tmp;
		}
		maxV = Math.max(maxV, rightMax + leftMax + A[mid]);
		return maxV;
	}
}
