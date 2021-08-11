
//link to question - https://leetcode.com/problems/flatten-binary-tree-to-linked-list/

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
    
    
    public static TreeNode help(TreeNode root){
        if(root == null)
            return null;
        
        TreeNode temp = root;
        TreeNode left = help(temp.left);
        TreeNode right = help(temp.right);
        
        temp.left = null;
        temp.right = left;
        while(temp.right != null){
            temp = temp.right;
        }
        temp.right = right;
        
        return root;
        
    }
    
    public void flatten(TreeNode root) {
        
        root = help(root);
    }
}
