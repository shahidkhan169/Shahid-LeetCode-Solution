/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
/**
 * Note: The returned array must be malloced, assume caller calls free().
 */

void inorder(struct TreeNode* root,int *res,int *index)
{
    if(root==NULL)
        return;
    inorder(root->left,res,index);
    res[(*index)++]=root->val;
    inorder(root->right,res,index);
}
int* inorderTraversal(struct TreeNode* root, int* returnSize) {
    int *res=(int*)malloc(100*sizeof(int));
    int index=0;
    inorder(root,res,&index);
    *returnSize=index;
    return res;
}
