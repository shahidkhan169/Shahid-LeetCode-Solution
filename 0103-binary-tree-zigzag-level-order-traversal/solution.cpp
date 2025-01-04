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
    vector<vector<int>> zigzagLevelOrder(TreeNode* root) {
        vector<vector<int>> res;
        if(root==NULL)
            return res;
        int flag=1;
        queue<TreeNode*> q;
        q.push(root);
        while(!q.empty())
        {
            vector<int> r;
            for(int count=q.size();count>0;count--)
            {
                TreeNode* curr=q.front();
                q.pop();
                r.push_back(curr->val);
                if(curr->left) q.push(curr->left);
                if(curr->right) q.push(curr->right);
            }
            if(flag==0)
                reverse(r.begin(),r.end());
            flag=!flag;
            res.push_back(r);
        }
        return res;
    }
};
