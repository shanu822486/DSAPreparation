import java.util.*;
import java.io.*;

public class StaircaseType {
  
  static long mod = 1000000007;
  
  public static long countWays(int n)
  {
        long[] res = new long[n + 1];
        res[0] = 1;
        res[1] = 1;
        res[2] = 2;
 
        for (int i = 3; i <= n; i++)
            res[i] = (res[i - 1] + res[i - 2] + res[i - 3] ) % mod;
 
        return res[n] ;
  }
  
  public static void main(String args[]) throws IOException {
    
    //write your code here
    Scanner s = new Scanner(System.in);
    int t = s.nextInt();
    
    while(t-- > 0)
    {
      int n = s.nextInt();
      
      System.out.println(countWays(n));
      
    }
    
  }
}
