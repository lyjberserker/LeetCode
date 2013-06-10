package question;

public class SetMatrixZeroes {
	public void setZeroes(int[][] matrix) {
		// Start typing your Java solution below
		// DO NOT write main() function
		int m = matrix.length;
		int n = matrix[0].length;
		boolean cZero = false;
		boolean rZero = false;
		for (int i = 0; i < m; i++)
			if (matrix[i][0] == 0)
				cZero = true;
		for (int i = 0; i < n; i++)
			if (matrix[0][i] == 0)
				rZero = true;
		for (int i = 1; i < m; i++)
			for (int j = 1; j < n; j++)
				if (matrix[i][j] == 0) {
					matrix[i][0] = 0;
					matrix[0][j] = 0;
				}
		for (int i = 1; i < m; i++)
			for (int j = 1; j < n; j++)
				if (matrix[i][0] == 0 || matrix[0][j] == 0)
					matrix[i][j] = 0;
		if (cZero)
			for (int i = 0; i < m; i++)
				matrix[i][0] = 0;
		if (rZero)
			for (int i = 0; i < n; i++)
				matrix[0][i] = 0;
	}
}
