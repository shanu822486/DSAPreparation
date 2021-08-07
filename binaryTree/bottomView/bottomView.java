

// Link To Question -  https://practice.geeksforgeeks.org/problems/bottom-view-of-binary-tree/1#


class Solution
{
    //Function to return a list containing the bottom view of the given tree.
    public ArrayList <Integer> bottomView(Node root)
    {
        // Code here
        
        ArrayList<Integer> arr = new ArrayList<Integer>();
        
        if(root == null) return arr;
        // to store the value corresponding to horizontal distance
        TreeMap<Integer, Integer> h1 = new TreeMap<Integer, Integer>();
        
        // to store the horizontal distance of node
        HashMap<Node, Integer> h2 = new HashMap<Node, Integer>();
        Queue<Node> q = new LinkedList<Node>();
        
        q.add(root);
        int hd = 0;
        h1.put(hd, root.data);
        h2.put(root, hd);
        while(q.size() > 0){
            Node temp = q.remove();
            hd = h2.get(temp);
            if(temp.left != null){
                h1.put(hd - 1, temp.left.data);
                h2.put(temp.left, hd - 1);
                q.add(temp.left);
            }
            if(temp.right != null){
                h1.put(hd + 1, temp.right.data);
                h2.put(temp.right, hd + 1);
                q.add(temp.right);
            }
   
        }
        
        
        for(int i : h1.values()){
            arr.add(i);
        }
		 
        return arr;
    }
}
