package question;

public class NextPermutation {
	public void nextPermutation(int[] num) {
		// Start typing your Java solution below
		// DO NOT write main() function
		int i = num.length - 2;
		while (i >= 0) {
			if (num[i] < num[i + 1])
				break;
			i--;
		}
		if (i < 0) {
			reverse(num, 0, num.length - 1);
			return;
		}
		int j = num.length - 1;
		while (j > i) {
			if (num[j] > num[i])
				break;
			j--;
		}
		swap(num, i, j);
		reverse(num, i + 1, num.length - 1);
	}

	public void swap(int[] num, int a, int b) {
		int tmp = num[a];
		num[a] = num[b];
		num[b] = tmp;
	}

	public void reverse(int[] num, int b, int e) {
		while (b < e)
			swap(num, b++, e--);
	}
}
