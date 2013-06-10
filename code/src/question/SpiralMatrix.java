package question;

import java.util.ArrayList;

public class SpiralMatrix {
	public ArrayList<Integer> spiralOrder(int[][] matrix) {
		// Start typing your Java solution below
		// DO NOT write main() function
		ArrayList<Integer> res = new ArrayList<Integer>();
		int r = matrix.length;
		if (r == 0)
			return res;
		int c = matrix[0].length;
		int x = 0;
		while (r > 1 && c > 1) {
			for (int i = x; i < x + c - 1; i++)
				res.add(matrix[x][i]);
			for (int i = x; i < x + r - 1; i++)
				res.add(matrix[i][x + c - 1]);
			for (int i = x + c - 1; i > x; i--)
				res.add(matrix[x + r - 1][i]);
			for (int i = x + r - 1; i > x; i--)
				res.add(matrix[i][x]);
			x++;
			r -= 2;
			c -= 2;
		}
		if (r >= 1 && c == 1)
			for (int i = x; i < x + r; i++)
				res.add(matrix[i][x]);
		else if (r == 1 && c >= 1)
			for (int i = x; i < x + c; i++)
				res.add(matrix[x][i]);
		return res;
	}
}
