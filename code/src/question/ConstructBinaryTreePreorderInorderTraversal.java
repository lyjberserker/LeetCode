package question;

public class ConstructBinaryTreePreorderInorderTraversal {
	public TreeNode buildTree(int[] inorder, int[] postorder) {
		// Start typing your Java solution below
		// DO NOT write main() function
		return buildTree(inorder, 0, inorder.length - 1, postorder, 0,
				postorder.length - 1);
	}

	public TreeNode buildTree(int[] inorder, int ib, int ie, int[] postorder,
			int pb, int pe) {
		// Start typing your Java solution below
		// DO NOT write main() function
		if (ib > ie || pb > pe)
			return null;
		TreeNode t = new TreeNode(postorder[pe]);
		int index = findIndex(inorder, postorder[pe]);
		t.left = buildTree(inorder, ib, index - 1, postorder, pb, pb + index
				- ib - 1);
		t.right = buildTree(inorder, index + 1, ie, postorder, pb + index - ib,
				pe - 1);
		return t;
	}

	public int findIndex(int[] num, int x) {
		for (int i = 0; i < num.length; i++)
			if (num[i] == x)
				return i;
		return -1;
	}
}
