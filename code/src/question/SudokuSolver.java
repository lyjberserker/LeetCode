package question;

import java.util.HashSet;
import java.util.Set;

public class SudokuSolver {
	public boolean solveSudoku(char[][] board) {
		// Start typing your Java solution below
		// DO NOT write main() function
		for (int i = 0; i < 9; i++)
			for (int j = 0; j < 9; j++)
				if (board[i][j] == '.') {
					for (int k = 0; k < 9; k++) {
						board[i][j] = (char) ('1' + k);
						if (isValidSudoku(board, i, j) && solveSudoku(board))
							return true;
						board[i][j] = '.';
					}
					return false;
				}
		return true;
	}

	public boolean isValidSudoku(char[][] board, int a, int b) {
		Set<Character> check = new HashSet<Character>();
		for (int i = 0; i < 9; i++)
			if (board[a][i] != '.')
				if (!check.add(board[a][i]))
					return false;
		check.clear();
		for (int i = 0; i < 9; i++)
			if (board[i][b] != '.')
				if (!check.add(board[i][b]))
					return false;
		check.clear();
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 3; j++) {
				int x = a / 3 * 3 + i;
				int y = b / 3 * 3 + j;
				if (board[x][y] != '.')
					if (!check.add(board[x][y]))
						return false;
			}
		return true;
	}
}
