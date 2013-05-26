package question;

public class ConvertSortedArrayBinarySearchTree {
	public TreeNode sortedArrayToBST(int[] num) {
		// Start typing your Java solution below
		// DO NOT write main() function
		return sortedArrayToBST(num, 0, num.length - 1);
	}

	public TreeNode sortedArrayToBST(int[] num, int b, int e) {
		if (b > e)
			return null;
		int mid = (b + e) / 2;
		TreeNode t = new TreeNode(num[mid]);
		t.left = sortedArrayToBST(num, b, mid - 1);
		t.right = sortedArrayToBST(num, mid + 1, e);
		return t;
	}
}
