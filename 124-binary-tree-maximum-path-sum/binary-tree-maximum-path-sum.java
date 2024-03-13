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
    public int maxPathSum(TreeNode root) {
        int ans[] = {Integer.MIN_VALUE};
      
        height(root,ans);
        return ans[0];
    }
    public int height(TreeNode node,int ans[])
    {
        if(node==null)
        {
            return 0;
        }
        
        int lmax = Math.max(0,height(node.left,ans));
        int rmax = Math.max(0,height(node.right,ans));
        ans[0] = Math.max(ans[0],lmax+rmax+node.val);
        return node.val+Math.max(lmax,rmax);
    }
}