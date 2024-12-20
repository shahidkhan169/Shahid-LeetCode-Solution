/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode reverseOddLevels(TreeNode root) {
        traverse(root.left,root.right,0);
        return root;
    }
    private void traverse(TreeNode n1,TreeNode n2,int level)
    {
        if(n1==null|| n2==null)
            return;
        if(level%2==0)
        {
            int value=n1.val;
            n1.val=n2.val;
            n2.val=value;
        }
        traverse(n1.left,n2.right,level+1);
        traverse(n1.right,n2.left,level+1);
    }
}
