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
 import java.math.*;
class Solution {
    public ListNode doubleIt(ListNode head) {
        if (head == null || head.val == 0) {
            return head;
        }

        BigInteger num = BigInteger.ZERO;
        ListNode temp = head;
        while (temp != null) {
            int value = temp.val;
            num = num.multiply(BigInteger.TEN).add(BigInteger.valueOf(value));
            temp = temp.next;
        }

        BigInteger ans = num.multiply(BigInteger.TWO);
        String rev1 = new StringBuilder(ans.toString()).reverse().toString();
        String rev = new StringBuilder(rev1.toString()).reverse().toString();

        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        for (int i = 0; i < rev.length(); i++) {
            char ch=rev.charAt(i);
            int a=Integer.parseInt(String.valueOf(ch));
            curr.next=new ListNode(a);
            curr=curr.next;
        }

        return dummy.next;
    }
}
