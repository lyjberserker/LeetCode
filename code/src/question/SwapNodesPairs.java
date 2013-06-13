package question;

public class SwapNodesPairs {
	public ListNode swapPairs(ListNode head) {
		// Start typing your Java solution below
		// DO NOT write main() function
		ListNode newHead = new ListNode(-1);
		newHead.next = head;
		ListNode pre = newHead;
		ListNode cur = newHead.next;
		while (cur != null && cur.next != null) {
			ListNode tmp = cur.next.next;
			cur.next.next = pre.next;
			pre.next = cur.next;
			cur.next = tmp;
			pre = cur;
			cur = cur.next;
		}
		return newHead.next;
	}
}
