package question;

public class MinimumDepthBinaryTree {
	public int minDepth(TreeNode root) {
		// Start typing your Java solution below
		// DO NOT write main() function
		if (root == null)
			return 0;
		int left = minDepth(root.left);
		int right = minDepth(root.right);
		if (left == 0 && right == 0)
			return 1;
		if (left == 0)
			return 1 + right;
		if (right == 0)
			return 1 + left;
		return 1 + Math.min(left, right);
	}
}
