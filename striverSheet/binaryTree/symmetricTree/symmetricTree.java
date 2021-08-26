
// link to Question - https://leetcode.com/problems/symmetric-tree/

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
    
    public static boolean help(TreeNode left, TreeNode right){
        
        if(left == null && right == null)
            return true;
        
        else if((left == null && right != null ) || (left != null && right == null))
            return false;
        
        return left.val == right.val && help(left.left, right.right) && help(left.right, right.left);
            
        
        
    }
    
    public boolean isSymmetric(TreeNode root) {
        
        if(root == null)
            return true;
        return help(root.left, root.right);
        
    }
}
