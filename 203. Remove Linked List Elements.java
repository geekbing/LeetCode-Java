/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode newHead = head;
		// 寻找到新的头部
		while(newHead != null && newHead.val == val)
		{
			newHead = newHead.next;
		}
		if(newHead == null)
		{
			return newHead;
		}
		ListNode pre = newHead;
		ListNode now = pre.next;
		while(now  != null)
		{
			if(now.val == val)
			{
				pre.next = now.next;
			}
			else
			{
				pre = pre.next;	
			}
			now = now.next;
		}
		return newHead;
    }
}