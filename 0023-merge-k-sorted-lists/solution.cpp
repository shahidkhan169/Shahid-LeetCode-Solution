/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    struct ListNode* merge(ListNode *list1,ListNode *list2)
    {
    struct ListNode* dummy = (struct ListNode*)malloc(sizeof(struct ListNode));
    
    dummy->next = NULL;
    struct ListNode* temp=dummy;
    while(list1!=NULL && list2!=NULL)
    {
        if(list1->val<list2->val)
        {   
            temp->next=list1;
            list1=list1->next;
        }
        else    
        {
            temp->next=list2;
            list2=list2->next;
        }
        temp=temp->next;
    }
    if(list1!=NULL)
        temp->next=list1;
    else
        temp->next=list2;
    
    return dummy->next;
    }
    ListNode* mergeKLists(vector<ListNode*>& lists) {
        ListNode *ans=NULL;
        for(auto l:lists)
        {
            ans=merge(ans,l);
        }
        return ans;
    }
};
