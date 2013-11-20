package question;

import java.util.Arrays;

public class ReplaceBlank {
	public static void main(String[] args) {
		String s = "Hello World! ";
		char[] a = s.toCharArray();
		a = Arrays.copyOf(a, 100);
		replaceBlank(a, s.length());
		System.out.println(a);
	}

	public static void replaceBlank(char[] a, int length) {
		int newLength = 0;
		int spaceNum = 0;
		for (int i = 0; i < a.length; i++)
			if (a[i] == ' ')
				spaceNum++;
		newLength = spaceNum * 2 + length;
		a[newLength] = '\0';
		for (int i = length - 1; i >= 0; i--) {
			if (a[i] == ' ') {
				a[--newLength] = '0';
				a[--newLength] = '2';
				a[--newLength] = '%';
			} else {
				a[--newLength] = a[i];
			}
		}
	}
}
