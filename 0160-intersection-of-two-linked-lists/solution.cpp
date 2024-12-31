/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    int length(ListNode *head)
    {
        int len=0;
        while(head!=NULL)
        {
            ++len;
            head=head->next;
        }
        return len;
    };
    ListNode *getIntersectionNode(ListNode *headA, ListNode *headB) {
        int n1=length(headA);
        int n2=length(headB);
        while(n1>n2)
        {
            headA=headA->next;
            n1--;
        }
        while(n2>n1)
        {
            headB=headB->next;
            n2--;
        }
        while(headA!=headB)
        {
            headA=headA->next;
            headB=headB->next;
        }
        return headB;
    }
};
