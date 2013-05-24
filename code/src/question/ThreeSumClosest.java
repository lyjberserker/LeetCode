package question;

import java.util.Arrays;

public class ThreeSumClosest {
	public int threeSumClosest(int[] num, int target) {
		// Start typing your Java solution below
		// DO NOT write main() function
		int min = Integer.MAX_VALUE;
		int sum = 0;
		Arrays.sort(num);
		for (int i = 0; i < num.length - 2; i++) {
			int j = i + 1;
			int k = num.length - 1;
			while (j < k) {
				int tmp = num[i] + num[j] + num[k];
				if (tmp == target)
					return target;
				if (Math.abs(tmp - target) < min) {
					sum = tmp;
					min = Math.abs(tmp - target);
				}
				if (tmp > target)
					k--;
				else
					j++;
			}
		}
		return sum;
	}
}
