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
    void tra(TreeNode* root,map<int,map<int , vector<int>>> &m,int idx,int level)
    {
        if(root==NULL)
            return;
        m[idx][level].push_back(root->val);
        tra(root->left,m,idx-1,level+1);
        tra(root->right,m,idx+1,level+1);
    }
    vector<vector<int>> verticalTraversal(TreeNode* root) {
        map<int,map<int , vector<int>>> m;
        tra(root,m,0,0);
        vector<vector<int>> v1;
        for(auto i:m)
        {
            vector<int> v2;
            for(auto li:i.second)
            {
                sort(li.second.begin(),li.second.end());
                for(auto e:li.second)
                    v2.push_back(e);
            }
            v1.push_back(v2);
        }
        return v1;
    }
    
};
