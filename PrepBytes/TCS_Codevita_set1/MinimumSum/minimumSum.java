import java.util.*;
import java.io.*;

public class minimumSum{
  

  public static void main(String args[]) throws IOException {
    
    //write your code here
    Scanner s = new Scanner(System.in);
    int t = s.nextInt();
    while(t-- > 0)
    {
      int m = s.nextInt();
      int n = s.nextInt();
      
      int []a[] = new int [m][n];
      
      for(int i = 0; i < m; i++)
      for(int j = 0; j < n; j++)
      a[i][j] = s.nextInt();
      
      
      for(int i = 1; i < n; i++)
      a[0][i] += a[0][i - 1] / 2;
      
      for(int j = 1; j < m; j++)
      a[j][0] += a[j - 1][0] / 2 ;
      
      for(int i = 1; i < m; i++)
      {
        for(int j = 1; j < n; j++ )
        a[i][j] += Math.min(a[i - 1][j] , a[i][j - 1]) / 2;
      }
      
      
      
      System.out.println(a[m -1][n - 1]);
      
      
    }
    
  }
}
