package question;

public class PathSum {
	public boolean hasPathSum(TreeNode root, int sum) {
		// Start typing your Java solution below
		// DO NOT write main() function
		if (root == null)
			return false;
		sum -= root.val;
		if (root.left == null && root.right == null) {
			if (sum == 0)
				return true;
			else
				return false;
		}
		return hasPathSum(root.left, sum) || hasPathSum(root.right, sum);
	}
}
