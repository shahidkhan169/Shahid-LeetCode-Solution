/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* swapPairs(struct ListNode* head) {
    if(head==NULL || head->next==NULL)
        return head;
    struct ListNode* dummy=(struct ListNode*)malloc(sizeof(struct ListNode));
    dummy->next=head->next;
    struct ListNode* temp=NULL;
    struct ListNode* prev=NULL;
    struct ListNode* curr=head;
    while(curr!=NULL && curr->next!=NULL)
    {
        temp=curr->next;
        if(prev!=NULL)
            prev->next=curr->next;
        curr->next=temp->next;
        temp->next=curr;
        if(prev==NULL)
            prev=curr;
        else
            prev=curr;
        curr=curr->next;
    }
    return dummy->next;
}
