package question;

public class Sort {
	public static void main(String[] args) {
		int a[] = { 8, 34, 64, 51, 32, 21, 63, 45, 100, 1, 2 };
		qSort(a, 0, a.length - 1);
		show(a);
	}

	public static void insertSort(int[] a) {
		int j = 0;
		for (int i = 1; i < a.length; i++) {
			int tmp = a[i];
			for (j = i; j > 0 && tmp < a[j - 1]; j--)
				a[j] = a[j - 1];
			a[j] = tmp;
		}
	}

	public static void heapSort(int[] a) {
		for (int i = a.length / 2; i >= 0; i--)
			percDown(a, i, a.length);
		for (int i = a.length - 1; i > 0; i--) {
			percDown(a, 0, i);
			swap(a, 0, i);
		}
	}

	public static void percDown(int[] a, int i, int n) {
		int child;
		int tmp = a[i];
		for (; 2 * i + 1 < n; i = child) {
			child = 2 * i + 1;
			if (child != n - 1 && a[child] < a[child + 1])
				child++;
			if (tmp < a[child])
				a[i] = a[child];
			else
				break;
		}
		a[i] = tmp;
	}

	public static void mergeSort(int[] a) {
		int[] tmp = new int[a.length];
		mergeSort(a, tmp, 0, a.length - 1);
	}

	public static void mergeSort(int[] a, int[] tmp, int b, int e) {
		if (b < e) {
			int mid = (b + e) / 2;
			mergeSort(a, tmp, b, mid);
			mergeSort(a, tmp, mid + 1, e);
			merge(a, tmp, b, mid + 1, e);
		}
	}

	public static void merge(int[] a, int[] tmp, int b, int mid, int e) {
		int le = mid - 1;
		int tmpP = b;
		int num = e - b + 1;
		while (b <= le && mid <= e)
			if (a[b] < a[mid])
				tmp[tmpP++] = a[b++];
			else
				tmp[tmpP++] = a[mid++];
		while (b <= le)
			tmp[tmpP++] = a[b++];
		while (mid <= e)
			tmp[tmpP++] = a[mid++];
		for (int i = 0; i < num; i++, e--)
			a[e] = tmp[e];
	}

	public static void quickSort(int[] a) {
		quickSort(a, 0, a.length - 1);
	}

	public static void quickSort(int[] a, int b, int e) {
		if (b < e) {
			int pivot = median(a, b, e);
			int i = b;
			int j = e - 1;
			for (;;) {
				while (a[++i] < pivot) {
				}
				while (a[--j] > pivot) {
				}
				if (i < j)
					swap(a, i, j);
				else
					break;
			}
			swap(a, i, e - 1);
			quickSort(a, b, i - 1);
			quickSort(a, i + 1, e);
		}
	}

	public static int median(int[] a, int b, int e) {
		int mid = (b + e) / 2;
		if (a[b] > a[mid])
			swap(a, b, mid);
		if (a[b] > a[e])
			swap(a, b, e);
		if (a[mid] > a[e])
			swap(a, mid, e);
		swap(a, mid, e - 1);
		return a[e - 1];
	}

	public static void swap(int[] a, int i, int j) {
		int tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}

	public static void qSort(int[] a, int b, int e) {
		if (b < e) {
			int i = partition(a, b, e);
			qSort(a, b, i - 1);
			qSort(a, i + 1, e);
		}
	}

	public static int partition(int[] a, int b, int e) {
		int pivot = a[b];
		while (b < e) {
			while (a[e] > pivot && b < e)
				e--;
			if (b < e)
				a[b++] = a[e];
			while (a[b] < pivot && b < e)
				b++;
			if (b < e)
				a[e--] = a[b];
		}
		a[b] = pivot;
		return b;
	}

	public static void show(int[] a) {
		for (int i : a) {
			System.out.print(i + "    ");
		}
		System.out.println();
	}
}
