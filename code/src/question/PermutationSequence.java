package question;

public class PermutationSequence {
	public String getPermutation(int n, int k) {
		// Start typing your Java solution below
		// DO NOT write main() function
		int[] nums = new int[n];
		int x = 1;
		for (int i = 0; i < n; i++) {
			nums[i] = i + 1;
			x *= (i + 1);
		}
		k--;
		String res = "";
		for (int i = 0; i < n; i++) {
			x /= (n - i);
			int num = k / x;
			res += String.valueOf(nums[num]);
			for (int j = num; j < n - i - 1; j++)
				nums[j] = nums[j + 1];
			k %= x;
		}
		return res;
	}
}
