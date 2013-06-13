package question;

public class SumRootLeafNumbers {
	private int sum;

	public int sumNumbers(TreeNode root) {
		// Start typing your Java solution below
		// DO NOT write main() function
		if (root == null)
			return 0;
		sum = 0;
		sumNumbers(root, 0);
		return sum;
	}

	public void sumNumbers(TreeNode t, int path) {
		if (t == null)
			return;
		path = path * 10 + t.val;
		if (t.left == null && t.right == null) {
			sum += path;
			return;
		}
		sumNumbers(t.left, path);
		sumNumbers(t.right, path);
	}
}
