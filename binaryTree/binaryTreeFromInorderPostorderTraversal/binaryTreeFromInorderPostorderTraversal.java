
//link to question - https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/

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
    
    
     public static TreeNode helper(int post, int instart, int inend, int[] inorder, int[] postorder, HashMap<Integer, Integer> map){
        
        
        if(post < 0  || instart > inend) return null;
        
        int val = postorder[post];
        TreeNode root = new TreeNode(val);
        
        if(instart == inend) return root;
        
        int inroot = map.get(val);
        
        
        
        root.right = helper(post - 1, inroot + 1, inend,                              inorder, postorder, map);
        root.left = helper(post - (inend - inroot + 1), instart, inroot - 1, inorder, postorder, map);
        
        return root;
        
    }
    
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        HashMap<Integer, Integer> map = new HashMap<>(); 
        
        for(int i = 0; i < inorder.length; i++){
            map.put(inorder[i], i);
        }
    
        
        return helper(postorder.length - 1, 0, inorder.length - 1, inorder, postorder, map);
        
    }
    
    
     
}
