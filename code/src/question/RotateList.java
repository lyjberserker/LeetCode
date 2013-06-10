package question;

public class RotateList {
	public ListNode rotateRight(ListNode head, int n) {
		// Start typing your Java solution below
		// DO NOT write main() function
		if (head == null || n == 0)
			return head;
		int len = 1;
		ListNode cur = head;
		while (cur.next != null) {
			cur = cur.next;
			len++;
		}
		n = len - n % len;
		cur.next = head;
		while (n-- > 0)
			cur = cur.next;
		head = cur.next;
		cur.next = null;
		return head;
	}
}
