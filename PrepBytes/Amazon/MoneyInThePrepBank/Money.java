import java.util.*;
import java.io.*;

public class Money{
  public static void main(String args[]) throws IOException {
    
    //write your code here
    Scanner s = new Scanner(System.in);
    
    int t = s.nextInt();
    while(t-- > 0)
    {
      int n = s.nextInt();
      int x = 0;
      int sum = 0;
      while(n > 0)
      {
        if(n / 7 > 0)
        {
          for(int i = 1; i <= 7; i++)
          sum += i + x;
          n -= 7;
        }
        else
        {
          for(int i = 1; i <= n % 7; i++)
          sum += i + x;
          n = 0;
        }
        
        x++;
        
      }
      System.out.println(sum);
    }
    
  }
}
