package question;

public class InversePairs {
	private static int count = 0;

	public static void main(String[] args) {
		int[] a = { 5, 4, 2, 1, 3, 6, 7, 8 };
		count(a, 0, a.length - 1);
		System.out.println(count);
	}

	public static void count(int[] a, int b, int e) {
		if (b < e) {
			int mid = (b + e) / 2;
			count(a, b, mid);
			count(a, mid + 1, e);
			merge(a, b, mid, e);
		}
	}

	public static void merge(int[] a, int b, int mid, int e) {
		int[] merged = new int[e - b + 1];
		int i = b;
		int j = mid + 1;
		int k = 0;
		while (i <= mid && j <= e) {
			if (a[i] <= a[j])
				merged[k++] = a[i++];
			else {
				merged[k++] = a[j++];
				count += mid - i + 1;
			}
		}
		while (i <= mid)
			merged[k++] = a[i++];
		while (j <= e)
			merged[k++] = a[j++];
	}

}
