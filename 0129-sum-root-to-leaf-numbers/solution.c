/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
void pathsum(struct TreeNode*root,int rs,int *sum)
{
    if(root==NULL) return;
    if(root->left==NULL && root->right==NULL)
        *sum=*sum+rs*10+root->val;
    pathsum(root->left,rs*10+root->val,sum);
    pathsum(root->right,rs*10+root->val,sum);
}
int sumNumbers(struct TreeNode* root) {
    int sum=0;
    pathsum(root,0,&sum);
    return sum;
}
