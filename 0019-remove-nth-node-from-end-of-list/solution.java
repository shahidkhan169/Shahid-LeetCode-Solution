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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr=head;
        int length=0;
        while(curr!=null)
        {
            length++;
            curr=curr.next;
        }
        int index=(length-n);
            if (index == 0) {
            return head.next; 
        }
        ListNode temp=head;
        ListNode prev=null;
        for(int i=0;i<index;i++)
        {
            prev=temp;
            temp=temp.next;
            
        }
        prev.next=temp.next;
        return head;
    }
}
