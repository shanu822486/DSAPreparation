

// Link to Question - https://practice.geeksforgeeks.org/problems/top-view-of-binary-tree/1#

class Solution
{
    //Function to return a list of nodes visible from the top view 
    //from left to right in Binary Tree.
    static ArrayList<Integer> topView(Node root)
    {
        // add your code
        
        ArrayList<Integer> arr = new ArrayList<Integer>();
        
        if(root == null)
        return arr;
        
        // to store horizontal distance to value
        TreeMap<Integer, Integer> h1 = new TreeMap<>();
        
        // to store node to horizontal distance
        HashMap<Node, Integer> h2 = new HashMap<>();
        
        Queue<Node> q = new LinkedList<Node>();
        
        q.add(root);
        int h = 0;
        h1.put(h, root.data);
        h2.put(root, h);
        while(q.size() > 0){
            
            Node temp = q.remove();
            
            h = h2.get(temp);
            
            if(!h1.containsKey(h)){
                h1.put(h, temp.data);
            }
            
            if(temp.left != null){
                q.add(temp.left);
                h2.put(temp.left, h - 1);
            }
            
            if(temp.right != null){
                q.add(temp.right);
                h2.put(temp.right, h + 1);
            }
        }
        
        for(int i  : h1.values())
        arr.add(i);
        
        return arr;
        
    }
}
