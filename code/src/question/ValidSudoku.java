package question;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {
	public boolean isValidSudoku(char[][] board) {
		// Start typing your Java solution below
		// DO NOT write main() function
		Set<Character> checkR = new HashSet<Character>();
		Set<Character> checkC = new HashSet<Character>();
		for (int i = 0; i < 9; i++) {
			checkR.clear();
			checkC.clear();
			for (int j = 0; j < 9; j++) {
				if (board[i][j] != '.')
					if (!checkR.add(board[i][j]))
						return false;
				if (board[j][i] != '.')
					if (!checkC.add(board[j][i]))
						return false;
			}
		}
		checkR.clear();
		for (int a = 0; a < 9; a += 3)
			for (int b = 0; b < 9; b += 3) {
				checkR.clear();
				for (int i = 0; i < 3; i++)
					for (int j = 0; j < 3; j++) {
						int x = a / 3 * 3 + i;
						int y = b / 3 * 3 + j;
						if (board[x][y] != '.')
							if (!checkR.add(board[x][y]))
								return false;
					}
			}
		return true;
	}

	public boolean isValidSudoku2(char[][] board) {
		// Start typing your Java solution below
		// DO NOT write main() function
		for (int i = 0; i < 9; i++)
			for (int j = 0; j < 9; j++)
				if (board[i][j] != '.')
					if (!isValidSudoku2(board, i, j))
						return false;
		return true;
	}

	public boolean isValidSudoku2(char[][] board, int a, int b) {
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
