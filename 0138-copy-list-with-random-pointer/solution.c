/**
 * Definition for a Node.
 * struct Node {
 *     int val;
 *     struct Node *next;
 *     struct Node *random;
 * };
 */

struct Node* copyRandomList(struct Node* head) {
	if(head==NULL)
        return NULL;
    struct Node* temp=head;
    while(temp!=NULL)
    {
        struct Node* newNode=(struct Node*)malloc(sizeof(struct Node));
        newNode->val=temp->val;
        newNode->next=temp->next;
        temp->next=newNode;
        temp=newNode->next;
    }
    temp=head;
    while(temp!=NULL)
    {
        temp->next->random=temp->random?temp->random->next:NULL;
        temp=temp->next->next;
    }
    struct Node* re=head->next;
    struct Node* temp1=head;
    struct Node* temp2=head->next;
    while(temp1!=NULL)
    {
        temp1->next=temp2->next;
        temp2->next=temp1->next?temp1->next->next:NULL;
        temp1=temp1->next;
        temp2=temp2->next;
    }
    return re;
}
