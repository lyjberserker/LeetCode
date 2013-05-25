package question;

public class BinaryTreeMaximumPathSum {
	private int max;

	public int maxPathSum(TreeNode root) {
		// Start typing your Java solution below
		// DO NOT write main() function
		max = Integer.MIN_VALUE;
		return Math.max(getSum(root), max);
	}

	public int getSum(TreeNode root) {
		// Start typing your Java solution below
		// DO NOT write main() function
		if (root == null)
			return 0;
		int left = getSum(root.left);
		int right = getSum(root.right);
		int sum = root.val;
		if (left > 0)
			sum += left;
		if (right > 0)
			sum += right;
		max = Math.max(max, sum);
		return Math.max(left + root.val, Math.max(right + root.val, root.val));
	}
}
