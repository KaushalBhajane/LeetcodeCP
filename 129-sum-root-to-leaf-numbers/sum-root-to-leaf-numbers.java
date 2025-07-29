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
    public int sumNumbers(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int sum = dfs(root, 0);
        return sum;
    }
    public int dfs(TreeNode root, int curr) {
        if(root == null) {
            return 0;
        }
        curr = curr*10 + root.val;
        if(root.left==null && root.right==null) {
            return curr;
        }
        int leftSum = dfs(root.left, curr);
        int rightSum = dfs(root.right, curr);
        return leftSum + rightSum;
    }
}