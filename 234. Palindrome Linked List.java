/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null)
		{
			return true;
		}
		if(head != null && head.next != null && head.next.next == null)
		{
		    return head.val == head.next.val;
		}
		ListNode slow = head;
		ListNode fast = head;
		ListNode nextNode = head.next;
		ListNode temp;
		while(fast.next != null && fast.next.next != null)
		{
			fast = fast.next.next;
			
			temp = nextNode;
			nextNode = nextNode.next;
			temp.next = slow;
			slow = temp;
		}
		if(fast.next == null)
		{
			slow = slow.next;
		}
		while(nextNode != null)
		{
			if(slow.val != nextNode.val)
			{
				return false;
			}
			nextNode = nextNode.next;
			slow = slow.next;
		}
		return true;
    }
}