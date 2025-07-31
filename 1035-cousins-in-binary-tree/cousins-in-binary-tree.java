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
    public boolean isCousins(TreeNode root, int x, int y) {
        if(root == null) {
            return false;
        }
        if(x==y) {
            return false;
        }
        boolean aFound = false;
        boolean bFound = false;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()) {
            int size = q.size();
            for(int i=0; i<size; i++) {

                TreeNode curr = q.poll();
                if(curr.val == x) {
                    aFound=true;
                }
                if(curr.val == y) {
                    bFound=true;
                }
                if(isSibling(curr, x, y)) {
                    return false;
                }

                if(curr.left != null) {
                    q.add(curr.left);
                }
                if(curr.right != null) {
                    q.add(curr.right);
                }
            }
            if(aFound && bFound) {
                return true;
            }
            if(aFound || bFound) {
                return false;
            }
        }
        return false;
    }
    public boolean isSibling(TreeNode root, int a, int b) {
        if(root == null) {
            return false;
        }
        
        if(root.left!=null && root.right!=null && root.left.val==a && root.right.val==b) {
            return true;
        }
        if(root.left!=null && root.right!=null && root.left.val==b && root.right.val==a) {
            return true;
        }
        
        return isSibling(root.left, a, b) || isSibling(root.right, a, b);
    }
}