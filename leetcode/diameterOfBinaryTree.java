// https://leetcode.com/problems/diameter-of-binary-tree/description/?envType=daily-question&envId=2024-02-27

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
    public int diameterOfBinaryTree(TreeNode root){

        Dpair n = dia(root);
        return n.d;
        
    }

    public Dpair dia(TreeNode node){

        if(node == null){
            Dpair t = new Dpair();
            t.d = 0;
            t.ht = -1;
            return t;
        }

        Dpair l = dia(node.left);
        Dpair r = dia(node.right);

        Dpair t = new Dpair();

        t.ht = Math.max(l.ht, r.ht) + 1;
        t.d = Math.max(l.ht + r.ht + 2, Math.max(l.d, r.d));

        return t;
    }

    public class Dpair{
        int ht;
        int d;
    }
}


// class Solution {//     public int diameterOfBinaryTree(TreeNode root) {

//         if(root == null) return 0;
//         return Math.max(height(root.left) + height(root.right) + 2, Math.max(diameterOfBinaryTree(root.left), diameterOfBinaryTree(root.right)));
        
//     }

//     public static int height(TreeNode node) {
//         if (node == null) {
//             return -1;
//         }

//         int lh = height(node.left);
//         int rh = height(node.right);

//         int th = Math.max(lh, rh) + 1;
//         return th;
//     }
// }