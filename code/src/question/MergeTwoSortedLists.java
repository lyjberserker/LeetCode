package question;

public class MergeTwoSortedLists {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		// Start typing your Java solution below
		// DO NOT write main() function
		ListNode head = new ListNode(-1);
		ListNode cur = head;
		while (l1 != null && l2 != null) {
			if (l1.val > l2.val) {
				cur.next = l2;
				cur = cur.next;
				l2 = l2.next;
			} else {
				cur.next = l1;
				cur = cur.next;
				l1 = l1.next;
			}
		}
		if (l1 != null)
			cur.next = l1;
		if (l2 != null)
			cur.next = l2;
		return head.next;
	}
}
