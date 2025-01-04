/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */


bool hasPathSum(struct TreeNode* root, int t) {
    if(root==NULL) return 0;
    if(root->left==NULL && root->right==NULL)
    {
        return (t-root->val)==0;
    }
    return hasPathSum(root->left,t-root->val)||hasPathSum(root->right,t-root->val);
}
