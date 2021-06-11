import java.util.*;
import java.io.*;

public class CricketPlayer {
  public static void main(String args[]) throws IOException {
    
    //write your code here
    Scanner s = new Scanner (System.in);
    int t = s.nextInt();
    while(t-- > 0)
    {
      int k = s.nextInt();
      int bucket_width [] = new int[k];
      for(int i = 0; i < k; i++)
      bucket_width[i] = s.nextInt();
      
      int n = s.nextInt();
      int balls_width[] = new int[n];
      for(int i = 0; i < n; i++)
      balls_width[i] = s.nextInt();
      
      int ball_bucket[] = new int[k];
      
      
      for(int i = 0; i < k; i++)
      ball_bucket[i] = 0;
      
      
      int j = 0;
      for(int i = 0; i < n; i++)
      {
        
        for( j = k - 1; j >= 0; j--)
        {
          if(bucket_width[j] >= balls_width[i] && ball_bucket[j] <= j )
          {
            ball_bucket[j] += 1;
            System.out.print(j + 1 + " ");
            break;
          }
        }
        if(j < 0)
        System.out.print("0" + " ");
      }
      System.out.println();
    }
  }
}
