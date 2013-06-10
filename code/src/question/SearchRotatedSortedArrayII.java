package question;

public class SearchRotatedSortedArrayII {
	public boolean search(int[] A, int target) {
		// Start typing your Java solution below
		// DO NOT write main() function
		int b = 0;
		int e = A.length - 1;
		while (b <= e) {
			int mid = (b + e) / 2;
			if (A[mid] == target)
				return true;
			if (A[b] < A[mid]) {
				if (target >= A[b] && target <= A[mid])
					e = mid - 1;
				else
					b = mid + 1;
			} else if (A[b] > A[mid]) {
				if (target <= A[e] && target >= A[mid])
					b = mid + 1;
				else
					e = mid - 1;
			} else
				b++;
		}
		return false;
	}
}
