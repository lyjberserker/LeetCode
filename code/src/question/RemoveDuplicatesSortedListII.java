package question;

public class RemoveDuplicatesSortedListII {
	public ListNode deleteDuplicates(ListNode head) {
		// Start typing your Java solution below
		// DO NOT write main() function
		if (head == null)
			return head;
		ListNode newHead = new ListNode(-1);
		newHead.next = head;
		ListNode pre = newHead;
		ListNode cur = head;
		ListNode next = head.next;
		boolean b = false;
		while (next != null) {
			if (cur.val == next.val)
				b = true;
			else if (b) {
				pre.next = next;
				b = false;
			} else
				pre = cur;
			cur = cur.next;
			next = next.next;
		}
		if (b)
			pre.next = null;
		return newHead.next;
	}
}
