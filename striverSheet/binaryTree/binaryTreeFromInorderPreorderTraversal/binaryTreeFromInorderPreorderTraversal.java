
// link to question - https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/

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
    
    
    
    public static TreeNode helper(int pre, int instart, int inend, int[] preorder, int[] inorder, HashMap<Integer, Integer> map){
        
        
        if(pre >= preorder.length  || instart > inend) return null;
        
        int val = preorder[pre];
        TreeNode root = new TreeNode(val);
        
        if(instart == inend) return root;
        
        int inroot = map.get(val);
        
        
        root.left = helper(pre + 1, instart, inroot - 1, preorder, inorder, map);
        root.right = helper(pre + inroot - instart + 1, inroot + 1, inend,                              preorder, inorder, map);
        
        return root;
        
    }
    
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer, Integer> map = new HashMap<>(); 
        
        for(int i = 0; i < inorder.length; i++){
            map.put(inorder[i], i);
        }
    
        
        return helper(0,0, inorder.length - 1, preorder, inorder, map);
        
    }
    
}
