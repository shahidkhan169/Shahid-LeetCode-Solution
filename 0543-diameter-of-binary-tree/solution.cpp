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
    int d;
    int dia(TreeNode* root)
    {
        if(root==NULL)
            return NULL;
        int lh=dia(root->left);
        int rh=dia(root->right);
        d=fmax(d,lh+rh);
        return 1+fmax(lh,rh);
    }
    int diameterOfBinaryTree(TreeNode* root) {
        d=0;
        dia(root);
        return d;
    }
};
