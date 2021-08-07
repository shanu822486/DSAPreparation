import java.util.*;
import java.io.*;

public class Main {
  public static void main(String args[]) throws IOException {
    
    //write your code here
    Scanner s = new Scanner(System.in);
    int t = s.nextInt();
    while(t-- > 0)
    {
      int n = s.nextInt();
      int a[] = new int[n + 1];
      a[0] = 0;
      a[1] = 1;
      int max = 1;
      for(int i = 1; i <= n / 2; i++)
      {
        if(2 * i <= n)
        {
          a[2 * i] = a[i];
          max = max > a[2 * i] ? max  : a[2 * i];
        }
        
        if(2 * i + 1 <= n)
        {
          a[2 * i  + 1] = a[i] + a[i + 1];
          max = max > a[2 * i + 1] ? max  : a[2 * i + 1];
        }
        
      }
      
      System.out.println(max);
    }
    
  }
}
