
//link to Question - https://leetcode.com/problems/linked-list-cycle/


/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        
        ListNode sp = head;
        ListNode fp = head;
        while(fp != null && fp.next != null)
        {
            fp = fp.next.next;
            sp = sp.next;
            if( fp == sp ) return true;
        }
        return false;
    }
}
