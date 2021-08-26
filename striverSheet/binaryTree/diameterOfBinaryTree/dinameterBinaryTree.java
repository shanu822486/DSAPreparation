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
 
 
 // link to Question - https://leetcode.com/problems/diameter-of-binary-tree/
 
 
class Solution {
    
    
    static class diameter{
        int dia = Integer.MIN_VALUE;
    }
    
    static int height(TreeNode root, diameter a){
        
        if(root == null)
            return 0;
        
        int leftHeight = height(root.left, a);
        int rightHeight = height(root.right, a);
        
        a.dia = Math.max(a.dia,  leftHeight + rightHeight);
        
        return 1 + Math.max(leftHeight, rightHeight);
        
    }
    
    
    public int diameterOfBinaryTree(TreeNode root) {
        
        if(root == null)
            return 0;
        
        
         diameter a = new diameter();
        
        
        int height = height(root, a);
        return a.dia ;
        
    }
}
