import java.util.*;
import java.io.*;

public class rectangle{
  public static void main(String args[]) throws IOException {
    
    //write your code here
    Scanner s = new Scanner(System.in);
    int t = s.nextInt();
    while(t-- > 0)
    {
      int n = s.nextInt();
      int []a = new int [n];
      int max = 0;
      for(int i = 0; i < n; i++)
      {
        int l = s.nextInt();
        int b = s.nextInt();
        a[i] = Math.min(l,b);
        max = max >= a[i] ? max : a[i];
      }
      
      int count  = 0;
      for(int i = 0; i < n; i++)
      {
        if(a[i] == max)
        {
          count++;
        }
      }
      System.out.println(count);
      
    }
    
  }
}
