package question;

public class ConstructBinaryTreeInorderPostorderTraversal {
	public TreeNode buildTree(int[] preorder, int[] inorder) {
		// Start typing your Java solution below
		// DO NOT write main() function
		return buildTree(preorder, 0, preorder.length - 1, inorder, 0,
				inorder.length - 1);
	}

	public TreeNode buildTree(int[] preorder, int pb, int pe, int[] inorder,
			int ib, int ie) {
		// Start typing your Java solution below
		// DO NOT write main() function
		if (pb > pe || ib > ie)
			return null;
		TreeNode t = new TreeNode(preorder[pb]);
		int index = findIndex(inorder, preorder[pb]);
		t.left = buildTree(preorder, pb + 1, pb + index - ib, inorder, ib,
				index - 1);
		t.right = buildTree(preorder, pb + index - ib + 1, pe, inorder,
				index + 1, ie);
		return t;
	}

	public int findIndex(int[] num, int x) {
		for (int i = 0; i < num.length; i++)
			if (num[i] == x)
				return i;
		return -1;
	}
}
