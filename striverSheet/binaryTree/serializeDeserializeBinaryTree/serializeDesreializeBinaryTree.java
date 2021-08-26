
// link to question - https://leetcode.com/problems/serialize-and-deserialize-binary-tree/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

// Encodes a tree to a single string.
StringBuilder str =new StringBuilder();
public String serialize(TreeNode root) {
    if(root==null)
        return  null;
    levelOrder(root);
    return str.toString();
    
}
public void levelOrder(TreeNode root){
    if(root==null)
        return;
       str.append(root.val);  
       str.append(",");
    levelOrder(root.left);
       str.append("#");   
       str.append(",");
    levelOrder(root.right);
    
}


static int n;
public TreeNode deserialize(String data) {
    if(data==null)
        return null;
    n=0;
    String[] arr = data.split(",");
    return helper(arr);
    
}

public TreeNode helper(String[] arr){
    if(n>=arr.length)
        return null;
    if(arr[n].equals("#"))
        return null;
   TreeNode node = new TreeNode(Integer.parseInt(arr[n]));
    n++;
    node.left   = helper(arr);
    n++;
    node.right = helper(arr);  
    return node;
    
}
}
// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));
