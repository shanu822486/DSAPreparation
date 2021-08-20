
//link to question -  https://leetcode.com/problems/maximum-sum-bst-in-binary-tree/


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



class nodeInfo{
    
    int maxAll ;// to store overall max sum
    int currMaxVal ; // to store each bst sum;
    int maxVal ;// max val of bst
    int minVal ; // min value of bst
    boolean isBST ; // check tree is bst or not;
    
    nodeInfo(){};
    nodeInfo(int maxAll, int currMaxSum, boolean isBST, int maxVal, int minVal){
        
        this.maxAll = maxAll;
        this.currMaxVal = currMaxSum;
        this.maxVal = maxVal;
        this.minVal = minVal;
        this.isBST = isBST;
        
        
    }
    
}
class Solution {
    
    
    static int MAX = Integer.MAX_VALUE;
    static int MIN = Integer.MIN_VALUE;
    
    public nodeInfo helper(TreeNode root) {
        
        if(root == null) return new nodeInfo(0,0,true,MIN, MAX);
        if(root.left == null && root.right == null)
            return new nodeInfo(root.val, root.val, true, root.val, root.val);
        
        nodeInfo left = helper(root.left);
        nodeInfo right = helper(root.right);
        
        nodeInfo curr = new nodeInfo();
        curr.currMaxVal = root.val + left.currMaxVal + right.currMaxVal;
        
        
        //if the tree rooted at root is bst
        if(left.isBST && right.isBST && left.maxVal < root.val && right.minVal > root.val){
            
            
            curr.maxAll = Math.max(Math.max(left.maxAll, right.maxAll),curr.currMaxVal);
            curr.isBST = true;
            curr.minVal = Math.min(Math.min(left.minVal, right.minVal), root.val);
            curr.maxVal = Math.max(Math.max(left.maxVal, right.maxVal), root.val);
            return curr;
            
        }
        
        
        // if not bst
        
        curr.maxAll = Math.max(left.maxAll, right.maxAll);
        
        curr.isBST = false;
        
        
        
        return curr;
                               
                    
    }
    
    public int maxSumBST(TreeNode root){
        
        int res = helper(root).maxAll;
        return res >= 0 ? res : 0;
    }
    
}
