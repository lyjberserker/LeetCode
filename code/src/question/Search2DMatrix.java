package question;

public class Search2DMatrix {
	public boolean searchMatrix(int[][] matrix, int target) {
		// Start typing your Java solution below
		// DO NOT write main() function
		if (matrix[0][0] > target)
			return false;
		int b = 0;
		int e = matrix.length - 1;
		while (b <= e) {
			int mid = (b + e) / 2;
			if (matrix[mid][0] == target)
				return true;
			if (matrix[mid][0] < target)
				b = mid + 1;
			else
				e = mid - 1;
		}
		int row = b - 1;
		b = 0;
		e = matrix[0].length - 1;
		while (b <= e) {
			int mid = (b + e) / 2;
			if (matrix[row][mid] == target)
				return true;
			if (matrix[row][mid] < target)
				b = mid + 1;
			else
				e = mid - 1;
		}
		return false;
	}
}
