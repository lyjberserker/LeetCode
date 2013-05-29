package question;

public class NQueenII {
	private int[] board;
	private int num;

	public int totalNQueens(int n) {
		// Start typing your Java solution below
		// DO NOT write main() function
		board = new int[n];
		num = 0;
		placeQueen(0, n);
		return num;
	}

	public void placeQueen(int row, int n) {
		if (row == n) {
			num++;
			return;
		}
		for (int i = 0; i < n; i++) {
			board[row] = i;
			if (check(row))
				placeQueen(row + 1, n);
		}
	}

	public boolean check(int row) {
		for (int i = 0; i < row; i++) {
			int diff = board[row] - board[i];
			if (diff == 0 || Math.abs(diff) == row - i)
				return false;
		}
		return true;
	}
}
