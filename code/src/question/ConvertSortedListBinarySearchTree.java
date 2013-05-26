package question;

public class ConvertSortedListBinarySearchTree {
	private ListNode cur;

	public TreeNode sortedListToBST(ListNode head) {
		// Start typing your Java solution below
		// DO NOT write main() function
		cur = head;
		int len = 0;
		while (head != null) {
			len++;
			head = head.next;
		}
		return sortedListToBST(0, len - 1);
	}

	public TreeNode sortedListToBST(int b, int e) {
		if (b > e)
			return null;
		int mid = (b + e) / 2;
		TreeNode left = sortedListToBST(b, mid - 1);
		TreeNode t = new TreeNode(cur.val);
		t.left = left;
		cur = cur.next;
		t.right = sortedListToBST(mid + 1, e);
		return t;
	}
}
