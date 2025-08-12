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
    TreeNode balanceBST(TreeNode root) {
        // Add your code here.
        // Refer the note for quick revision
        ArrayList<Integer> sortedNodes = new ArrayList<>();
        inorder(root, sortedNodes);
        
        TreeNode newRoot = balancedTree(sortedNodes, 0, sortedNodes.size()-1);
        return newRoot;
    }
    
    void inorder(TreeNode root, ArrayList<Integer> sortedNodes) {
        if(root == null) {
            return;
        }
        
        inorder(root.left, sortedNodes);
        sortedNodes.add(root.val);
        inorder(root.right, sortedNodes);
    }
    
    TreeNode balancedTree(ArrayList<Integer> sortedNodes, int start, int end) {
        if(start>end) {
            return null;
        }
        int mid = start + (end-start)/2;
        TreeNode root = new TreeNode(sortedNodes.get(mid));
        
        root.left = balancedTree(sortedNodes, start, mid-1);
        root.right = balancedTree(sortedNodes, mid+1, end);
        
        return root;
    }
}