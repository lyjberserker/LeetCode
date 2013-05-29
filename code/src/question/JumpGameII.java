package question;

public class JumpGameII {
	public int jump(int[] A) {
		// Start typing your Java solution below
		// DO NOT write main() function
		int start = 0;
		int end = 0;
		int times = 0;
		if (A.length == 1)
			return 0;
		while (end < A.length) {
			int max = 0;
			times++;
			for (int i = start; i <= end; i++) {
				if (A[i] + i >= A.length - 1)
					return times;
				if (A[i] + i > max)
					max = A[i] + i;
			}
			start = end + 1;
			end = max;
		}
		return -1;
	}
}
