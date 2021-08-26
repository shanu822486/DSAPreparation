
// link  to Question - https://leetcode.com/problems/add-two-numbers/

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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode();
        ListNode temp = null;
        int carr = 0;
        int sum = 0;
        while(l1 != null && l2 != null)
        {
            if(temp == null)
                temp = head;
            else
                temp = temp.next;
            sum = l1.val + l2.val + carr;
            temp.val = sum % 10;
            carr = sum / 10;
            temp.next = new ListNode();
            l1 = l1.next;
            l2 = l2.next;
            
            
        }
        
        while(l1 != null)
        {
            temp = temp.next;
            sum = l1.val + carr;
            temp.val = sum % 10;
            carr = sum / 10;
            temp.next = new ListNode();
            l1 = l1.next;
            
            
        }
        
         while(l2 != null)
        {
            temp = temp.next;
            sum = l2.val + carr;
            temp.val = sum % 10;
            carr = sum / 10;
            temp.next = new ListNode();
            l2 = l2.next;
            
        }
        if(carr > 0)
        {
            temp = temp.next;
            temp.val = carr;
        }
        else
            temp.next = null;
        
        
        return head;
        
    }
}
