// https://leetcode.com/problems/find-bottom-left-tree-value/description/?envType=daily-question&envId=2024-02-28

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
    public int findBottomLeftValue(TreeNode root) {
        Deque<TreeNode> q = new ArrayDeque<>();
        q.offer(root);

        int lnode = 0;

        while (q.size() > 0) {
            int lsize = q.size();

            for (int i = 0; i < lsize; i++) {
                TreeNode cnode = q.poll();

                if (i == 0) {
                    lnode = cnode.val;
                }

                if (cnode.left != null) {
                    q.offer(cnode.left);
                }

                if (cnode.right != null) {
                    q.offer(cnode.right);
                }
            }
        }

        return lnode;
    }
}






