package question;

public class PartitionList {
	public ListNode partition(ListNode head, int x) {
		// Start typing your Java solution below
		// DO NOT write main() function
		ListNode left = new ListNode(-1);
		ListNode right = new ListNode(-1);
		ListNode leftHead = left;
		ListNode rightHead = right;
		while (head != null) {
			if (head.val < x) {
				left.next = head;
				left = left.next;
			} else {
				right.next = head;
				right = right.next;
			}
			head = head.next;
		}
		right.next = null;
		left.next = rightHead.next;
		return leftHead.next;
	}
}
