package question;

public class RemoveDuplicatesSortedArrayII {
	public int removeDuplicates(int[] A) {
		// Start typing your Java solution below
		// DO NOT write main() function
		if (A.length <= 2)
			return A.length;
		int len = 1;
		int i = 1;
		int count = 1;
		while (i < A.length) {
			if (A[i] == A[i - 1]) {
				if (count < 2)
					count++;
				else {
					i++;
					continue;
				}
			} else
				count = 1;
			A[len++] = A[i++];
		}
		return len;
	}
}
