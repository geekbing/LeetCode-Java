/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode nodeA = headA;
		ListNode nodeB = headB;
		while(true)
		{
		    if(nodeA == nodeB)
			{
				return nodeA;
			}
			if(nodeA == null && nodeB != null)
			{
				nodeA = headB;
				nodeB = nodeB.next;
			}
			else if(nodeA != null && nodeB == null)
			{
				nodeB = headA;
				nodeA = nodeA.next;
			}
			else
			{
			    nodeA = nodeA.next;    
			    nodeB = nodeB.next;
			}
		}
    }
}