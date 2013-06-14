package question;

public class WordSearch {
	public boolean exist(char[][] board, String word) {
		// Start typing your Java solution below
		// DO NOT write main() function
		for (int i = 0; i < board.length; i++)
			for (int j = 0; j < board[0].length; j++)
				if (board[i][j] == word.charAt(0)) {
					int[][] visited = new int[board.length][board[0].length];
					visited[i][j] = 1;
					if (searchString(board, visited, word.substring(1), i, j))
						return true;
				}
		return false;
	}

	public boolean searchString(char[][] board, int[][] visited, String word,
			int i, int j) {
		if (word.length() == 0)
			return true;
		for (int p = -1; p < 2; p++)
			for (int q = -1; q < 2; q++)
				if (p * q == 0 && !(p == 0 && q == 0)
						&& (i + p >= 0 && i + p < board.length)
						&& (j + q >= 0 && j + q < board[0].length))
					if (board[i + p][j + q] == word.charAt(0)
							&& visited[i + p][j + q] == 0) {
						visited[i + p][j + q] = 1;
						if (searchString(board, visited, word.substring(1), i
								+ p, j + q))
							return true;
						visited[i + p][j + q] = 0;
					}
		return false;
	}
}
