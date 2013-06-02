package question;

import java.util.Arrays;

public class MedianTwoSortedArrays {
	public double findMedianSortedArrays(int A[], int B[]) {
		// Start typing your Java solution below
		// DO NOT write main() function
		if ((A.length + B.length) % 2 == 0)
			return (findMedianSortedArrays(A, B, (A.length + B.length) / 2) + findMedianSortedArrays(
					A, B, (A.length + B.length) / 2 + 1)) / 2;
		else
			return findMedianSortedArrays(A, B, (A.length + B.length) / 2 + 1);
	}

	public double findMedianSortedArrays(int A[], int B[], int k) {
		if (A.length == 0)
			return B[k - 1];
		if (B.length == 0)
			return A[k - 1];
		if (k == 1)
			return Math.min(A[0], B[0]);
		if (A[A.length / 2] >= B[B.length / 2]) {
			if (A.length / 2 + B.length / 2 + 1 >= k)
				return findMedianSortedArrays(Arrays.copyOf(A, A.length / 2),
						B, k);
			else
				return findMedianSortedArrays(A,
						Arrays.copyOfRange(B, B.length / 2 + 1, B.length), k
								- B.length / 2 - 1);
		} else {
			if (A.length / 2 + B.length / 2 + 1 >= k)
				return findMedianSortedArrays(A,
						Arrays.copyOf(B, B.length / 2), k);
			else
				return findMedianSortedArrays(
						Arrays.copyOfRange(A, A.length / 2 + 1, A.length), B, k
								- A.length / 2 - 1);
		}
	}
}
