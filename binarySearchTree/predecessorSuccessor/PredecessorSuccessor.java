
// link to Question - https://practice.geeksforgeeks.org/problems/predecessor-and-successor/1#


class GfG
{
    public static void findPreSuc(Node root, Res p, Res s, int key)
    {
       // add your code here
       
       Node pre = null;
       Node suc = null;
       
       if(root == null){
       
       return;
    }
    
    while(root != null){
        
        if(root.data == key){
            if(root.left != null){
                pre = root.left;
                while(pre.right != null)
                pre = pre.right;
                
            }
            
            if(root.right != null){
                suc = root.right;
                while(suc.left != null)
                suc = suc.left;
                
            }
            
            p.pre = pre;
            s.succ = suc;
            return;
        }
        
        if(root.data > key){
            suc = root;
            root = root.left;
        }
        
        else {
            pre = root;
            root = root.right;
        }
    }
    
    p.pre = pre;
    s.succ = suc;
    }
}
