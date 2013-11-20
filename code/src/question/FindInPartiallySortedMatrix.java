package question;

public class FindInPartiallySortedMatrix {
	public static void main(String[] args) {
		int matrix[][] = { { 1, 2, 8, 9 }, { 2, 4, 9, 12 }, { 4, 7, 10, 13 },
				{ 6, 8, 11, 15 } };
		System.out.println(Find(matrix, 5));
	}

	public static boolean Find(int[][] matrix, int target) {
		boolean b = false;
		if (matrix.length == 0)
			return b;
		int row = matrix.length;
		int column = matrix[0].length;
		if (column > 0) {
			int i = 0;
			int j = column - 1;
			while (i < row && j >= 0) {
				if (matrix[i][j] == target)
					return true;
				else if (matrix[i][j] < target)
					i++;
				else
					j--;
			}
		}
		return b;
	}
}
