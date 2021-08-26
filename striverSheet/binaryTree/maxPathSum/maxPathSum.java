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
 
// Link to question - https://leetcode.com/problems/binary-tree-maximum-path-sum/ 
 
 
class Solution {
    
    static class sum{
        
        int res = Integer.MIN_VALUE;
        
    }
    
    static int help(TreeNode root, sum a){
        if(root == null)
            return 0;
        
        
        
        int leftSum = help(root.left,a);
        int rightSum = help(root.right,a);
        
        
        
        int maxSum = leftSum + rightSum + root.val;
        
        int maxLeftRight = Math.max(Math.max(leftSum, rightSum) + root.val, root.val);
        
        
        
        a.res = Math.max(a.res, Math.max(maxSum, maxLeftRight));
        
        return maxLeftRight;
    }
    
    public int maxPathSum(TreeNode root) {
        
        if(root == null)
            return 0;
        
        sum a = new sum();
        
        help(root,a);
        
        return a.res;
        
        
    }
}
