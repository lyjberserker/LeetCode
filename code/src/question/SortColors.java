package question;

public class SortColors {
	public void sortColors(int[] A) {
		// Start typing your Java solution below
		// DO NOT write main() function
		int i = 0;
		int j = A.length - 1;
		int cur = i;
		while (cur <= j) {
			if (A[cur] == 0)
				swap(A, i++, cur);
			else if (A[cur] == 2)
				swap(A, j--, cur--);
			cur++;
		}
	}

	public void swap(int[] A, int a, int b) {
		int tmp = A[a];
		A[a] = A[b];
		A[b] = tmp;
	}
}
