/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    int minDepth(TreeNode* root) {
        queue<TreeNode*> q;
        if(root==NULL)
            return 0;
        int level=0;
        q.push(root);
        while(!q.empty())
        {
            vector<int> r;
            int c=q.size();
            while(c!=0)
            {
                TreeNode* curr=q.front();
                q.pop();
                r.push_back(curr->val);
                if(!curr->left && !curr->right)
                    return level+1;
                if(curr->left) q.push(curr->left);
                if(curr->right) q.push(curr->right);
                --c;
            }
            ++level;
        }
        return 0;
    }
};
