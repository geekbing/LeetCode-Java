/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int val = l1.val + l2.val;
		ListNode head = new ListNode(val % 10);
        ListNode newHead = head;
		int carry = val > 9 ? 1 : 0;
		l1 = l1.next;
		l2 = l2.next;
		
		while(l1 != null || l2 != null){
			if(l1 == null) {
				val = l2.val + carry;
				head.next = new ListNode(val % 10);
				head = head.next;
				l2 = l2.next;
				carry = val > 9 ? 1 : 0;
				continue;
			}
			if(l2 == null) {
				val = l1.val + carry;
				head.next = new ListNode(val % 10);
				head = head.next;
				l1 = l1.next;
				carry = val > 9 ? 1 : 0;
				continue;
			}
			val = l1.val + l2.val + carry;
			head.next = new ListNode(val % 10);
			head = head.next;
			carry = val > 9 ? 1 : 0;
			l1 = l1.next;
			l2 = l2.next;
		}
		if(carry == 1){
		    head.next = new ListNode(1);
		}
		return newHead;
    }
}