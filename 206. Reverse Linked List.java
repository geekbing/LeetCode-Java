/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    // 递归的算法
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null)
        {
            return head;
        }
        ListNode last = head.next;
        ListNode newHead = reverseList(head.next);
        last.next = head;
        head.next = null;
        
        return newHead;
    }

    // 迭代的算法
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null)
        {
            return head;
        }
        ListNode now = head;
        ListNode nextNode = head.next;
        now.next = null;
        
        ListNode temp;
        while(nextNode != null)
        {
            temp = nextNode.next;
            nextNode.next = now;
            
            now = nextNode;
            nextNode = temp;
        }
        return now;
    }
}