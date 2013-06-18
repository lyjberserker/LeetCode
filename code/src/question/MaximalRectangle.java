package question;

import java.util.Stack;

public class MaximalRectangle {
	public int maximalRectangle(char[][] matrix) {
		if (matrix.length == 0)
			return 0;
		int[][] a = new int[matrix.length][matrix[0].length];
		for (int i = 0; i < matrix.length; ++i)
			for (int j = 0; j < matrix[i].length; ++j)
				a[i][j] = matrix[i][j] - '0';
		for (int i = 1; i < a.length; ++i)
			for (int j = 0; j < a[i].length; ++j)
				if (a[i][j] == 1)
					a[i][j] = a[i - 1][j] + 1;
		int max = 0;
		for (int i = 0; i < a.length; ++i)
			max = Math.max(max, largestRectangleArea(a[i]));
		return max;
	}

	public int largestRectangleArea(int[] height) {
		// Start typing your Java solution below
		// DO NOT write main() function
		Stack<Integer> s = new Stack<Integer>();
		int max = 0;
		int[] h = new int[height.length + 1];
		for (int i = 0; i < height.length; i++)
			h[i] = height[i];
		h[height.length] = 0;
		for (int i = 0; i < h.length; i++) {
			if (s.isEmpty() || h[i] > h[s.peek()])
				s.push(i);
			else {
				int tmp = s.pop();
				max = Math.max(max, h[tmp]
						* (s.isEmpty() ? i : i - s.peek() - 1));
				i--;
			}
		}
		return max;
	}
}
