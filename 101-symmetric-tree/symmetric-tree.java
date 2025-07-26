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
    public boolean isSymmetric(TreeNode root) {
        if(root == null) {
            return true;
        }
        return isSame(root.left, root.right);
    }
    public boolean isSame(TreeNode st1, TreeNode st2) {
        if(st1 == null && st2 == null) {
            return true;
        }
        if(st1 == null || st2 == null) {
            return false;
        }
        if(st1.val != st2.val) {
            return false;
        }
        boolean leftSub = isSame(st1.left, st2.right);
        boolean rightSub = isSame(st1.right, st2.left);
        return leftSub && rightSub;
    }
}