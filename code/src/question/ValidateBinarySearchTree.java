package question;

public class ValidateBinarySearchTree {
	public boolean isValidBST(TreeNode root) {
		// Start typing your Java solution below
		// DO NOT write main() function
		return isValidBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	public boolean isValidBST(TreeNode root, int min, int max) {
		if (root == null)
			return true;
		if (root.val > min && root.val < max
				&& isValidBST(root.left, min, root.val)
				&& isValidBST(root.right, root.val, max))
			return true;
		return false;
	}
}
