

/* code to print the postOrder traversal of binary tree without using recursion
*/


import java.util.*;


class Node{
    int val;
    Node left, right;
    Node(int val){
      this.val = val;
      left = null;
      right = null;
    }
  }


public class Main {
  
  public static void postOrder(Node root){
    if(root == null)
    return;

    Stack<Node> stack = new Stack<>();
    while(true) {

      while(root != null) {
          stack.push(root);
          stack.push(root);
          root = root.left;
      }
             
            
      if(stack.empty()) return;
      root = stack.pop();
             
      if(!stack.empty() && stack.peek() == root) root = root.right;
             
      else {
        System.out.print(root.val + " "); root = null;
      }
    }

  }

  public static void main(String[] args) {
    Node root = new Node(2);
    root.left = new Node(13);
    root.right = new Node(14);
    root.left.left = null;
    root.left.right = new Node(43);
    root.right.left = new Node(23);
    root.right.right = null;

    postOrder(root);

  
  }
}