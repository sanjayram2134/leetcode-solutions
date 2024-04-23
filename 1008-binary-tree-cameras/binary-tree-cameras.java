/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
/*
 * 1 - i'M ALREADY COVERRD'
 * 0 - I HAVE CAMERA
 * -1 - I NEED CAMERA
 */
class Solution {
    public int cameras = 0;

    public int solver(TreeNode root) {
        if (root == null) {
            return 1;
        }
        // post order traversal

        int lc = solver(root.left);
        int rc = solver(root.right);

        if (lc == -1 || rc == -1) {
            cameras++;
            return 0;

        }
        if (lc == 0 || rc == 0)
            return 1;

        return -1;
    }

    public int minCameraCover(TreeNode root) {
        if (solver(root) == -1)
            cameras++;

        return cameras;
    }
}