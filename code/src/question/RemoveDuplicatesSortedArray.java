package question;

public class RemoveDuplicatesSortedArray {
	public int removeDuplicates(int[] A) {
		// Start typing your Java solution below
		// DO NOT write main() function
		if (A.length <= 1)
			return A.length;
		int i = 1;
		int len = 1;
		while (i < A.length) {
			if (A[i] > A[len - 1])
				A[len++] = A[i];
			i++;
		}
		return len;
	}
}
