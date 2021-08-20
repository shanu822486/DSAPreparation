
// link to question - https://leetcode.com/problems/binary-search-tree-iterator/

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
class BSTIterator {
    
    int pointer = -1;
    ArrayList<Integer> arr = new ArrayList<>();
    int size;

    public BSTIterator(TreeNode root) {
        
        inorder(root);
        this.size = arr.size();
    }
    
    public  void inorder(TreeNode root){
        if(root == null) return;
        
        inorder(root.left);
        arr.add(root.val);
        inorder(root.right);
        
        return;
    }
    
    public int next() {
        return arr.get(++pointer);
    }
    
    public boolean hasNext() {
        
        return pointer < size - 1;
        
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
