/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || head.next == null)
        {
            return null;
        }
        ListNode fast = head;
		ListNode slow = head;
		while(n >= 1)
		{
			fast = fast.next;
			if(fast == null)
			{
			    return head.next;
			}
			n--;
		}
		while(fast.next != null)
		{
			fast = fast.next;
			slow = slow.next;
		}
		slow.next = slow.next.next;
		return head;
    }
}