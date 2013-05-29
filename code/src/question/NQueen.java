package question;

import java.util.ArrayList;

public class NQueen {
	private int[] board;

	public ArrayList<String[]> solveNQueens(int n) {
		// Start typing your Java solution below
		// DO NOT write main() function
		board = new int[n];
		ArrayList<String[]> res = new ArrayList<String[]>();
		placeQueen(0, n, res);
		return res;
	}

	public void placeQueen(int row, int n, ArrayList<String[]> res) {
		if (row == n) {
			res.add(convertBoard(board));
			return;
		}
		for (int i = 0; i < n; i++) {
			board[row] = i;
			if (check(row))
				placeQueen(row + 1, n, res);
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

	public String[] convertBoard(int[] board) {
		String[] ans = new String[board.length];
		for (int i = 0; i < board.length; i++) {
			String s = "";
			for (int j = 0; j < board.length; j++) {
				if (j == board[i])
					s += "Q";
				else
					s += ".";
			}
			ans[i] = s;
		}
		return ans;
	}
}
