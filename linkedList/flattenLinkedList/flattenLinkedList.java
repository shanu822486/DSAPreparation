
// link to Question - https://practice.geeksforgeeks.org/problems/flattening-a-linked-list/1

class GfG
{
    static Node merge(Node a , Node b){
        
        if(a == null)
        return b;
        
        if(b == null) return a;
        
        
        Node res = new Node(0) ;
       
            
        if(a.data > b.data){
        res.data = b.data;
        
        res.bottom = merge(a,b.bottom);
        }
        
        else{
            res.data = a.data;
            res = a;
            res.bottom = merge(a.bottom, b);
        }
        
        
        res.next = null;
        
        return res;
        
        
    }
    
    Node flatten(Node root)
    {
	// Your code here
	
	    if(root == null || root.next == null)
	    return root;
	    
	    
	    root.next = flatten(root.next);
	    
	    root = merge(root, root.next);
	    
	    return root;
	
	
    }
}
