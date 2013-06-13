package question;

import java.util.Stack;

public class SurroundedRegions {
	public void solve(char[][] board) {
		// Start typing your Java solution below
		// DO NOT write main() function
		int m = board.length;
		if (m == 0)
			return;
		int n = board[0].length;
		Stack<Integer> x = new Stack<Integer>();
		Stack<Integer> y = new Stack<Integer>();
		for (int i = 0; i < m; i++) {
			if (board[i][0] == 'O') {
				x.add(i);
				y.add(0);
			}
			if (board[i][n - 1] == 'O') {
				x.add(i);
				y.add(n - 1);
			}
		}
		for (int i = 0; i < n; i++) {
			if (board[0][i] == 'O') {
				x.add(0);
				y.add(i);
			}
			if (board[m - 1][i] == 'O') {
				x.add(m - 1);
				y.add(i);
			}
		}
		while (!x.isEmpty()) {
			int a = x.pop();
			int b = y.pop();
			board[a][b] = 'Y';
			if (a > 0 && board[a - 1][b] == 'O') {
				x.push(a - 1);
				y.push(b);
			}
			if (b > 0 && board[a][b - 1] == 'O') {
				x.push(a);
				y.push(b - 1);
			}
			if (a < m - 1 && board[a + 1][b] == 'O') {
				x.push(a + 1);
				y.push(b);
			}
			if (b < n - 1 && board[a][b + 1] == 'O') {
				x.push(a);
				y.push(b + 1);
			}
		}
		for (int i = 0; i < m; i++)
			for (int j = 0; j < n; j++) {
				if (board[i][j] == 'O')
					board[i][j] = 'X';
				if (board[i][j] == 'Y')
					board[i][j] = 'O';
			}
	}
}
