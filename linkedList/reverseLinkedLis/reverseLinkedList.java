

//link to Question - https://leetcode.com/problems/reverse-linked-list/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public static ListNode help(ListNode prev, ListNode curr, ListNode next)
    {
        if(next == null)
            return prev;
        
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
        
        return help(prev,curr, next);
        
    }
    public ListNode reverseList(ListNode head) {
        if(head == null)
            return head;
        ListNode prev = null, curr = head, next = head;
        return help(prev, curr, next);
        
        
        
    }
}
