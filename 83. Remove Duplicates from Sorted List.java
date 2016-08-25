/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null || (head.next.next == null && head.val != head.next.val))
        {
            return head;
        }
        ListNode now = head;
        ListNode nextNode = head.next;
        while(nextNode != null)
        {
            if(nextNode.val == now.val)
            {
                nextNode = nextNode.next;
                now.next = nextNode;
            }
            else
            {
                nextNode = nextNode.next;
                now = now.next;
            }
        }
        return head;
    }
}