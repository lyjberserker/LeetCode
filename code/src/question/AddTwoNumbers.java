package question;

public class AddTwoNumbers {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		// Start typing your Java solution below
		// DO NOT write main() function
		ListNode res = new ListNode(-1);
		ListNode head = res;
		int carry = 0;
		while (l1 != null || l2 != null) {
			int value = carry;
			if (l1 != null) {
				value += l1.val;
				l1 = l1.next;
			}
			if (l2 != null) {
				value += l2.val;
				l2 = l2.next;
			}
			carry = value / 10;
			head.next = new ListNode(value % 10);
			head = head.next;
		}
		if (carry == 1)
			head.next = new ListNode(1);
		return res.next;
	}
}
