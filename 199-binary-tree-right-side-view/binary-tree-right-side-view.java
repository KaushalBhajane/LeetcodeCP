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
    public List<Integer> rightSideView(TreeNode root) {
        if (root == null) return new ArrayList<>();
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(root, 0));
        int maxDepth = -1;
        HashMap<Integer, Integer> map = new HashMap<>();
        while(!q.isEmpty()) {
            Pair currPair = q.poll();
            TreeNode currNode = currPair.getKey();
            int depth = currPair.getValue();
            maxDepth = Math.max(maxDepth, depth);

            map.put(depth, currNode.val);

            if(currNode.left != null) {
                q.add(new Pair(currNode.left, depth+1));
            }

            if(currNode.right != null) {
                q.add(new Pair(currNode.right, depth+1));
            }
        }

        List<Integer> list = new ArrayList<>();
        for(int i=0; i<=maxDepth; i++) {
            list.add(map.get(i));
        }
        return list;
    }
    class Pair {
        private TreeNode node;
        private int depth;

        Pair(TreeNode node, int depth) {
            this.node = node;
            this.depth = depth;
        }

        public TreeNode getKey() {
            return node;
        }

        public int getValue() {
            return depth;
        }
    }
}