import java.util.*;
import java.io.*;

public class threeSum {
  public static void main(String args[]) throws IOException {
    
    //write your code here
    
    Scanner s = new Scanner(System.in);
    int t = s.nextInt();
    while(t-- > 0)
    {
      int n = s.nextInt();
      int r = s.nextInt();
      int a[] = new int[n];
      
      for(int i = 0 ; i < n; i++)
      {
        a[i] = s.nextInt();
       
      }
      
      int flag = 0;
      
      for(int i = 0; i < n - 2; i++)
      {
        HashSet<Integer> h = new HashSet<>();
        int curr_sum = r - a[i];
        for(int j = i + 1; j < n ; j++)
        {
          if(h.contains(curr_sum - a[j]))
          {
            System.out.println("Yes");
            flag = 1;
            break;
          }
          h.add(a[j]);
        }
        if(flag == 1)
        break;
      }
      if(flag == 0)
      System.out.println("No");
    }
    
  }
}
