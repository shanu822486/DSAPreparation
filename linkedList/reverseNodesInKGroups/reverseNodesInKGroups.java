
// link to question - https://leetcode.com/problems/reverse-nodes-in-k-group/

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
    public static int length_list(ListNode head)
    {
        if(head==null)
            return 0;
        int length=0;
        while(head!=null)
        {
            head=head.next;
            length++;
        }
        return length;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        int length=length_list(head);
        if(k>length)
            return head;
        int times=length/k;
        ListNode prev = null; 
        ListNode current = head; 
        ListNode nex = null;
        ListNode previous=null;
        for(int i=0;i<times;i++)
        {
            int x=k;
            ListNode temp=current;
              
            while (x--!=0) { 
                nex = current.next; 
                current.next = prev; 
                prev = current; 
                current = nex; 
            } 
            temp.next=current;
            if(i==0)
            {
                previous=head;
                head=prev;
            }
                
            else{
                previous.next=prev;
                previous=temp;
            }
                
            prev=null;
        }
        return head;
    }
}
