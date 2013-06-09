package question;

public class RemoveNthNodeFromEndList {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		// Start typing your Java solution below
		// DO NOT write main() function
		ListNode newHead = new ListNode(-1);
		newHead.next = head;
		ListNode l1 = newHead;
		ListNode l2 = head;
		for (int i = 0; i < n; i++) {
			if (l2 == null)
				return head;
			l2 = l2.next;
		}
		while (l2 != null) {
			l1 = l1.next;
			l2 = l2.next;
		}
		l1.next = l1.next.next;
		return newHead.next;
	}
}
