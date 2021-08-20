
// link to Question - https://www.codingninjas.com/codestudio/problems/ceil-from-bst_920464?leftPanelTab=0

public class Solution {

    public  static int findCeil(TreeNode<Integer> node, int x) {

        // Write your code here
        int ceil = -1;
        while(node != null){
            if(node.data == x){
                ceil = x;
                return ceil;
            }
            
            if(node.data > x){
                ceil = node.data;
                node = node.left;
            }
            else
            {
                
                node = node.right;
            }
            
        }
        
        return ceil;

    }
}
