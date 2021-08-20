
//link to question - https://leetcode.com/problems/validate-binary-search-tree/

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
    public boolean isValidBST(TreeNode root) {
        return helper(root,Long.MAX_VALUE,Long.MIN_VALUE);
    }
    
    public boolean helper(TreeNode root, long max, long min)
    {
        if(root == null)
            return false;
        
        if(root.val < max && root.val > min)
        {
            boolean leftCheck = true;
            boolean rightCheck  = true;
            
            if(root.left != null)
                leftCheck = helper(root.left, root.val, min);
            
            if(root.right != null)
                rightCheck = helper(root.right, max, root.val);
            
            return leftCheck && rightCheck;
        }
        return false;
    }
}
