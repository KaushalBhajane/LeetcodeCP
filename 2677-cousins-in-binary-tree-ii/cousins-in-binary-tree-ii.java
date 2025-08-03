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
    public TreeNode replaceValueInTree(TreeNode root) {

        HashMap<Integer, Integer> storeSum = new HashMap<>();
        computeSum(root, storeSum, 0);

        updateNodeValues(root, storeSum, 0);
        return root;
    }

    public void updateNodeValues(TreeNode root, HashMap<Integer, Integer> storeSum, int level) {

        if(root==null) {
            return;
        }
        if(level == 0) {
            root.val = 0;
        }
        if(root.left != null && root.right != null) {
            int siblingSum = root.left.val + root.right.val;
            root.left.val = storeSum.get(level+1) - siblingSum;
            root.right.val = storeSum.get(level+1) - siblingSum;
        }
        else if(root.left != null) {
            root.left.val = storeSum.get(level+1) - root.left.val; 
        }
        else if(root.right != null) {
            root.right.val = storeSum.get(level+1) - root.right.val; 
        }

        updateNodeValues(root.left, storeSum, level+1);
        updateNodeValues(root.right, storeSum, level+1);

    }

    public void computeSum(TreeNode root, HashMap<Integer, Integer> storeSum, int level) {

        if(root == null) {
            return;
        }
        if(!storeSum.containsKey(level)) {
            storeSum.put(level, root.val);
        }
        else {
            storeSum.put(level, storeSum.get(level)+root.val);
        }

        computeSum(root.left, storeSum, level+1);
        computeSum(root.right, storeSum, level+1);
    }
}