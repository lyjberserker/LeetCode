package question;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}

public class BalancedBinaryTree {
	public boolean isBalanced(TreeNode root) {
		// Start typing your Java solution below
		// DO NOT write main() function
		if (root == null)
			return true;
		int left = getHeight(root.left);
		int right = getHeight(root.right);
		if (Math.abs(left - right) > 1)
			return false;
		return isBalanced(root.left) && isBalanced(root.right);
	}

	public int getHeight(TreeNode root) {
		if (root == null)
			return 0;
		return 1 + Math.max(getHeight(root.right), getHeight(root.left));
	}
}
