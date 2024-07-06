// https://leetcode.com/problems/same-tree/description/?envType=daily-question&envId=2024-02-26

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
    public boolean isSameTree(TreeNode p, TreeNode q) {

        if(p == null && q == null) return true;
        if(p == null || q == null) return false;
        return (isSameTree(p.left, q.left)) && (isSameTree(p.right, q.right)) && ((p.val == q.val));
    }
}

//Below one also works

// class Solution {
//     public boolean isSameTree(TreeNode p, TreeNode q) {

//         if( p == null && q == null) return true;

//         if(p == null || q == null) return false;

//         boolean l = isSameTree(p.left, q.left);
//         boolean r = isSameTree(p.right, q.right);
        
//         boolean c = (p.val == q.val);

//         return l && r && c;
//     }
// }
