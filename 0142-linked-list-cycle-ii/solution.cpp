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
    ListNode *detectCycle(ListNode *head) {
        unordered_set<ListNode *> set;
        while(head)
        {
            if(set.count(head)==0)
                set.insert(head);
            else
                return head;
            head=head->next;
        }
        return NULL;
    }
};
