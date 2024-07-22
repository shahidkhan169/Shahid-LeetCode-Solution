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
    public ListNode swapPairs(ListNode head) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode curr=dummy;
        ListNode temp;
        while(curr.next!=null && curr.next.next!=null )
        {
            temp=curr.next.next;
            curr.next.next = temp.next;
            temp.next = curr.next;
            curr.next=temp;
            curr=curr.next.next;;
        }
        return dummy.next;
    }
}
