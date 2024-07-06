package java;
// https://leetcode.com/problems/amount-of-time-for-binary-tree-to-be-infected/description/?envType=daily-question&envId=2024-01-10


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
    private int r;

    public int amountOfTime(TreeNode root, int start) {
        dist(root, start);
        return r;
    }

    private int dist(TreeNode node, int start){
        if(node == null) return 0;

        int ld = dist(node.left, start);
        int rd = dist(node.right, start);

        if(node.val == start){
            r = Math.max(ld, rd);
            return -1;
        }
        else if(ld >= 0 && rd >= 0)
            return Math.max(ld, rd)+1;
        
        r = Math.max(r, Math.abs(ld - rd));
        return Math.min(ld, rd) - 1;
    }
}