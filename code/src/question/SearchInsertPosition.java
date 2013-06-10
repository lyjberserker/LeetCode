package question;

public class SearchInsertPosition {
	public int searchInsert(int[] A, int target) {
		// Start typing your Java solution below
		// DO NOT write main() function
		int b = 0;
		int e = A.length - 1;
		while (b <= e) {
			int mid = (b + e) / 2;
			if (A[mid] == target)
				return mid;
			else if (A[mid] < target)
				b = mid + 1;
			else
				e = mid - 1;
		}
		return b;
	}
}
