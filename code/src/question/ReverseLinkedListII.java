package question;

public class ReverseLinkedListII {
	public ListNode reverseBetween(ListNode head, int m, int n) {
		// Start typing your Java solution below
		// DO NOT write main() function
		ListNode newHead = new ListNode(-1);
		newHead.next = head;
		ListNode cur = newHead;
		ListNode pre = null;
		for (int i = 1; i <= n; i++) {
			if (i == m)
				pre = cur;
			if (i > m) {
				cur.next = head.next;
				head.next = pre.next;
				pre.next = head;
				head = cur;
			}
			cur = head;
			head = head.next;
		}
		return newHead.next;
	}
}
