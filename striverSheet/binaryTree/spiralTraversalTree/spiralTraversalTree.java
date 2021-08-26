
// link to Question - https://practice.geeksforgeeks.org/problems/level-order-traversal-in-spiral-form/1#


class Spiral
{
    //Function to return a list containing the level order 
    //traversal in spiral form.	
    ArrayList<Integer> findSpiral(Node root) 
    {
        // Your code here
        ArrayList<Integer> arr = new ArrayList<>();
        
        if(root == null)
        return arr;
        
        
        Queue<Node> q = new LinkedList<Node>();
        ArrayList<Node> a = new ArrayList<Node>();
        q.add(root);
        int dir = -1;
        int size = 1;
        Node temp;
        while(q.size() > 0){
            size = q.size();
            
            while(size-- > 0){
                temp = q.remove();
                arr.add(temp.data);
                
                // checking going from left to right
                if(dir == 0 || dir == -1){
                if(temp.left != null )
                a.add(temp.left);
                
                if(temp.right != null)
                a.add(temp.right);
                }
                
                // checking from right to left
                else
                {
                    if(temp.right != null)
                    a.add(temp.right);
                    
                    
                    if(temp.left != null )
                    a.add(temp.left);
                }
            }
            
            if(dir == - 1 ){
                for(Node i : a){
                    q.add(i);
                }
                dir = 0;
            }
            else{
                
                for(int i = a.size() - 1; i >= 0; i--)
                q.add(a.get(i));
                dir = 1 - dir;
            }
            
            a.clear();
            
            
            
        }
        
        return arr;
    }
}
