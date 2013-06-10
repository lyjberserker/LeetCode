package question;

public class ReverseNodesKGroup {
	public ListNode reverseKGroup(ListNode head, int k) {
		// Start typing your Java solution below
		// DO NOT write main() function
		if (head == null || k <= 1)
			return head;
		ListNode newHead = new ListNode(-1);
		newHead.next = head;
		ListNode pre = newHead;
		int i = 0;
		while (head != null) {
			i++;
			if (i % k == 0) {
				pre = reverse(pre, k);
				head = pre.next;
			} else
				head = head.next;
		}
		return newHead.next;
	}

	public ListNode reverse(ListNode pre, int k) {
		ListNode cur = pre.next;
		ListNode next = cur.next;
		while (--k > 0) {
			cur.next = next.next;
			next.next = pre.next;
			pre.next = next;
			next = cur.next;
		}
		return cur;
	}
}
