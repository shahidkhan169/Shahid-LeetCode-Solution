/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
bool isPalindrome(struct ListNode* head) {
    int top=-1;
    int stack[100000];
    struct ListNode* temp=head;
    while(temp!=NULL)
    {
        stack[++top]=temp->val;
        temp=temp->next;
    }
    temp=head;
    while(temp!=NULL)
    {
        if(stack[top--]!=temp->val)
            return false;
        temp=temp->next;
    }
    return true;
}
