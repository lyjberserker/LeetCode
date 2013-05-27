package question;

public class FirstMissingPositive {
	public int firstMissingPositive(int[] A) {
		// Start typing your Java solution below
		// DO NOT write main() function
		for (int i = 0; i < A.length; i++) {
			if (A[i] <= 0)
				A[i] = A.length + 1;
		}
		for (int i = 0; i < A.length; i++) {
			int tmp = Math.abs(A[i]);
			if (tmp <= A.length)
				A[tmp - 1] = -Math.abs(A[tmp - 1]);
		}
		for (int i = 0; i < A.length; i++) {
			if (A[i] > 0)
				return i + 1;
		}
		return A.length + 1;
	}
}
