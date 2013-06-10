package question;

public class SearchRange {
	public int[] searchRange(int[] A, int target) {
		// Start typing your Java solution below
		// DO NOT write main() function
		int[] res = { -1, -1 };
		int b = 0;
		int e = A.length - 1;
		while (b < e) {
			int mid = (b + e) / 2;
			if (A[mid] < target)
				b = mid + 1;
			else
				e = mid;
		}
		if (A[b] != target)
			return res;
		res[0] = b;
		e = A.length;
		while (b < e) {
			int mid = (b + e) / 2;
			if (A[mid] <= target)
				b = mid + 1;
			else
				e = mid;
		}
		res[1] = e - 1;
		return res;
	}
}
