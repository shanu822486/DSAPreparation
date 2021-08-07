import java.util.*;
import java.io.*;

public class binaryCodes{
  public static void main(String args[]) throws IOException {
    
    //write your code here
    Scanner s = new Scanner(System.in);
    int t = s.nextInt();
    s.nextLine();
    while(t-- > 0)
    {
      
      String [] a = s.nextLine().split(" ");

      
      int k = Integer.parseInt(a[1]);
      
      HashSet<String> h = new HashSet<String>();
      for(int i = 0; i <= a[0].length() - k; i++)
      {
        h.add(a[0].substring(i, i+k));
      }
      
      /*Iterator itr = h.iterator();
  
        
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }*/
      
      if(h.size() == (int)Math.pow(2,k))
      {
        System.out.println("Yes");
      }
      else
      System.out.println("No");
      
    }
    
  }
}
