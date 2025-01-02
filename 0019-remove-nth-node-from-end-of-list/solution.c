/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* removeNthFromEnd(struct ListNode* head, int n) {
    int c=0;
    struct ListNode* temp1=head;
    while(temp1!=NULL)
    {
        c++;
        temp1=temp1->next;
    }
    int pos=c-n;
    if(pos==0)
        return head->next;
    struct ListNode*  temp=head;
    struct ListNode* prev=NULL;
    for(int i=0;i<pos;i++)
    {
        prev=temp;
        temp=temp->next;
    }
    prev->next=temp->next;
    free(temp);
    return head;
}
