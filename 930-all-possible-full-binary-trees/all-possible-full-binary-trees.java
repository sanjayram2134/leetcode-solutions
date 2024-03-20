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
    public List<TreeNode> allPossibleFBT(int n) {
                List<TreeNode> result = new ArrayList<>();
        
        if (n % 2 == 0) {
            // Even number of nodes cannot form full binary trees
            return result;
        }
        
        if (n == 1) {
            // Only one node forms a single-node tree
            result.add(new TreeNode(0));
            return result;
        }
        
        // For each possible number of nodes in the left subtree
        for (int leftNodes = 1; leftNodes < n; leftNodes += 2) {
            // Get all possible left subtrees with leftNodes
            List<TreeNode> leftSubtrees = allPossibleFBT(leftNodes);
            // Get all possible right subtrees with n - 1 - leftNodes
            List<TreeNode> rightSubtrees = allPossibleFBT(n - 1 - leftNodes);
            
            // Combine left and right subtrees to form full binary trees
            for (TreeNode left : leftSubtrees) {
                for (TreeNode right : rightSubtrees) {
                    TreeNode root = new TreeNode(0);
                    root.left = left;
                    root.right = right;
                    result.add(root);
                }
            }
        }
        
        return result;
    }
}