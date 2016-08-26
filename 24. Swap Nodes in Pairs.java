/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null)
        {
            return head;
        }
        ListNode newHead = head.next;
        ListNode preNode = new ListNode(-1);
        ListNode now = head;
        ListNode nextNode = head.next;
        
        while(nextNode != null)
        {
            preNode.next = nextNode;
            nextNode = nextNode.next;
            now.next.next = now;
            now.next = nextNode;
            
            preNode = now;
            now = nextNode;
            if(nextNode == null)
            {
                return newHead;
            }
            nextNode = nextNode.next;                   
        }
        return newHead;
    }
}