package question;

public class SearchRotatedSortedArray {
	public int search(int[] A, int target) {
		// Start typing your Java solution below
		// DO NOT write main() function
		int b = 0;
		int e = A.length - 1;
		while (b <= e) {
			int mid = (b + e) / 2;
			if (A[mid] == target)
				return mid;
			if (A[b] <= A[mid]) {
				if (target <= A[mid] && target >= A[b])
					e = mid - 1;
				else
					b = mid + 1;
			} else if (target >= A[mid] && target <= A[e])
				b = mid + 1;
			else
				e = mid - 1;
		}
		return -1;
	}
}
