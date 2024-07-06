// https://leetcode.com/problems/pseudo-palindromic-paths-in-a-binary-tree/description/?envType=daily-question&envId=2024-01-24

// /**
//  * Definition for a binary tree node.
//  * public class TreeNode {
//  *     int val;
//  *     TreeNode left;
//  *     TreeNode right;
//  *     TreeNode() {}
//  *     TreeNode(int val) { this.val = val; }
//  *     TreeNode(int val, TreeNode left, TreeNode right) {
//  *         this.val = val;
//  *         this.left = left;
//  *         this.right = right;
//  *     }
//  * }
//  */
// class Solution {



//     public int pseudoPalindromicPaths (TreeNode root) {

//         int c = 0;

//         if(root.left == null && root.right == null){
//             ArrayList<Integer> arr = ntrp(root);

//             boolean isPalindrome = help (arr);

//             if(isPalindrome) c++;
//         }

//         int c1 = pseudoPalindromicPaths(root.left);
//         int c1 = pseudoPalindromicPaths(root.rigth);

//         return c1+c2;
        
//     }

//     public boolean help(ArrayList <Integer> lst){

//             int [] freq = new int [10];

//             for(int i = 0; i<freq.length; i++){
//                 freq[lst.get(i)]++;
//             }

//             boolean f = true;

//             if(arr.length()%2 == 0){
//                 for(int i = 0; i< arr.length;i++){
//                     if(freq[i]%2!=0){
//                         f = false;
//                     }
//                 }
//             } else {
//                 int oc = 0;
//                 for(int i = 0; i< arr.length;i++){
//                     if(freq[i]%2!=0){
//                         oc++;
//                     }
//                 }

//                 if(oc<=1){
//                     f = false;
//                 }
//             }

//             return f;

//     }

//     public ArrayList<Integer> ntrp (TreeNode node, int data){

//         if(node == null) return new ArrayList<>();

//         if(node.val == data){
//             ArrayList <Integer> res = new ArrayList<>();
//             res.add(data);
//         }

//         ArrayList <Integer> l = ntrp(node.left, data);
//         ArrayList <Integer> r = ntrp(node.right, data);

//         if(l.size()>0){
//             l.add(node.val);
//             return l;
//         }


//          if(r.size()>0){
//             r.add(node.val);
//             return r;
//         }

//         return r;


//     }
// }

import java.util.ArrayList;

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

    public int pseudoPalindromicPaths(TreeNode root) {
        return countPalindromicPaths(root, new int[10]);
    }

    private int countPalindromicPaths(TreeNode node, int[] freq) {
        if (node == null) {
            return 0;
        }

        freq[node.val]++;

        if (node.left == null && node.right == null) {
            int oddCount = 0;
            for (int f : freq) {
                if (f % 2 != 0) {
                    oddCount++;
                }
            }
            if (oddCount <= 1) {
                freq[node.val]--; // Backtrack
                return 1;
            }
        }

        int count = 0;
        count += countPalindromicPaths(node.left, freq);
        count += countPalindromicPaths(node.right, freq);

        freq[node.val]--; // Backtrack
        return count;
    }
}

