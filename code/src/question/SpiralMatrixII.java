package question;

public class SpiralMatrixII {
	public int[][] generateMatrix(int n) {
		// Start typing your Java solution below
		// DO NOT write main() function
		int[][] res = new int[n][n];
		int x = 0;
		int num = 1;
		while (n > 1) {
			for (int i = x; i < x + n - 1; i++)
				res[x][i] = num++;
			for (int i = x; i < x + n - 1; i++)
				res[i][x + n - 1] = num++;
			for (int i = x + n - 1; i > x; i--)
				res[x + n - 1][i] = num++;
			for (int i = x + n - 1; i > x; i--)
				res[i][x] = num++;
			n -= 2;
			x++;
		}
		if (n == 1)
			res[x][x] = num;
		return res;
	}
}
