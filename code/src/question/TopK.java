package question;

public class TopK {
	private static final int K = 6;

	public static void main(String[] args) {
		int a[] = { 8, 34, 64, 51, 32, 21, 63, 45, 100, 1, 2 };
		hTopK(a);
		for (int i = 0; i < K; i++)
			System.out.println(a[i]);
	}

	public static int partition(int[] a, int b, int e) {
		int tmp = a[b];
		while (b < e) {
			while (a[e] < tmp && b < e)
				e--;
			if (b < e)
				a[b++] = a[e];
			while (a[b] > tmp && b < e)
				b++;
			if (b < e)
				a[e--] = a[b];
		}
		a[b] = tmp;
		return b;
	}

	public static int qTopK(int[] a, int b, int e, int k) {
		int i = 0;
		if (b < e) {
			i = partition(a, b, e);
			if (i == k)
				i = k;
			else if (i < k)
				i = qTopK(a, i + 1, e, k - i);
			else
				i = qTopK(a, b, i - 1, k);
		}
		return i;
	}

	public static void hTopK(int[] a) {
		for (int i = K / 2; i >= 0; i--)
			percDown(a, i);
		for (int i = K; i < a.length; i++)
			if (a[i] > a[0]) {
				a[0] = a[i];
				percDown(a, 0);
			}
	}

	private static void percDown(int[] a, int i) {
		int child;
		int tmp = a[i];
		for (; 2 * i + 1 < K; i = child) {
			child = 2 * i + 1;
			if (child < K - 1 && a[child] > a[child + 1])
				child++;
			if (a[child] < tmp)
				a[i] = a[child];
			else
				break;
		}
		a[i] = tmp;
	}
}
