import java.util.*;
import java.io.*;

public class gcd {
  
  // This function basically return  gcd of given co-ordinates .
  public static long reach(long a, long b)
  {
    if(a == b)
    return a;
    
    if(a > b)
    return reach(a - b, b);
    
    return reach(a , b - a);
  }
  
  
  public static void main(String args[]) throws IOException {
    
    //write your code here
    Scanner s = new Scanner(System.in);
    
    int t = s.nextInt();
    
    while(t-- > 0)
    {
      long x1 = Math.abs(s.nextLong());
      long y1 = Math.abs(s.nextLong());
      long x2 = Math.abs(s.nextLong());
      long y2 = Math.abs(s.nextLong());
      if(reach(x1, y1) == reach(x2, y2))
      System.out.println("Yes");
      else
      System.out.println("No");
      
    }
  }
}
