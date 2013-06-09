package question;

public class RemoveDuplicatesSortedList {
	public ListNode deleteDuplicates(ListNode head) {
		// Start typing your Java solution below
		// DO NOT write main() function
		if (head == null)
			return head;
		ListNode cur = head;
		ListNode next = cur.next;
		while (next != null) {
			if (cur.val != next.val) {
				cur.next = next;
				cur = next;
			}
			next = next.next;
		}
		cur.next = null;
		return head;
	}
}
