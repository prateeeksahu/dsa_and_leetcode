// https://leetcode.com/problems/even-odd-tree/

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
    public boolean isEvenOddTree(TreeNode root) {

        Deque<TreeNode> q = new ArrayDeque<>();
        q.offer(root);
        int l = 0;

        while(q.size()>0){
            int csize = q.size();
            Integer d = null;

            for(int i = 0;i<csize; i++){
                TreeNode t = q.poll();

                if ((l % 2 == 0 && (t.val % 2 == 0 || (d != null && t.val <= d))) ||
                    (l % 2 == 1 && (t.val % 2 == 1 || (d != null && t.val >= d)))) {
                    return false;
                }

                if(t.left != null) q.offer(t.left);
                if(t.right != null) q.offer(t.right);
                d = t.val;
            }

            l++;

        }

        return true;
        
    }
}