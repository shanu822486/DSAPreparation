/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
 
 
// link to question - https://leetcode.com/problems/delete-node-in-a-linked-list/ 
class Solution {
    public void deleteNode(ListNode node) {
        
        if(node.next == null)
        {
            node = null;
            return;
        }
        
        
        ListNode temp = node.next;
        node.val = temp.val;
        node.next = temp.next;
        
        return;
        
        
    }
}
