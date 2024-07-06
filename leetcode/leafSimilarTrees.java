package java;
// https://leetcode.com/problems/leaf-similar-trees/?envType=daily-question&envId=2024-01-09

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

    public void leaves(TreeNode root, ArrayList<Integer> lev){
        if(root == null) {return;}

        if(root.left == null && root.right == null) {lev.add(root.val);}

        leaves(root.left, lev);
        leaves(root.right, lev);

    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {

        ArrayList<Integer> lev1 = new ArrayList<>();
        ArrayList<Integer> lev2 = new ArrayList<>();

        leaves(root1, lev1);
        leaves(root2, lev2);

        return lev1.equals(lev2);
    }
        
    
}