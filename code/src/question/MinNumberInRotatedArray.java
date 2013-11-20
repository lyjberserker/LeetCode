package question;

public class MinNumberInRotatedArray {
	public static void main(String[] args) {
		int[] a = { 1, 1, 1, 0, 1, 1, 1, 1, 1 };
		int[] b = { 4, 5, 6, 7, 8, 1, 2, 3 };
		System.out.println(findMin(a));
		System.out.println(findMin(b));
	}

	public static int findMin(int[] a) {
		if (a.length == 0)
			return Integer.MIN_VALUE;
		int i = 0;
		int j = a.length - 1;
		int mid = 0;
		while (a[i] >= a[j]) {
			if (j - i == 1)
				return a[j];
			mid = i - ((i - j) >> 1);
			if (a[i] == a[j] && a[i] == a[mid])
				return minInOrder(a, i, j);
			if (a[mid] >= a[i])
				i = mid;
			else if (a[mid] <= a[j])
				j = mid;
		}
		return a[mid];
	}

	public static int minInOrder(int[] a, int i, int j) {
		int min = a[i];
		for (int k = i + 1; k <= j; k++) {
			if (a[k] < min)
				min = a[k];
		}
		return min;
	}
}
