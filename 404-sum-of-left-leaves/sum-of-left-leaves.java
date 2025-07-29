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
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int sum =0;
        if(root.left != null) {
            boolean isLeaf = root.left.left==null && root.left.right==null;
            if(isLeaf) {
                sum += root.left.val;
            }
            else {
                int leftSum = sumOfLeftLeaves(root.left);
                sum += leftSum;
            }
        }
        int rightSum = sumOfLeftLeaves(root.right);
        sum += rightSum;
        return sum;
    }
}