import java.util.*;
import java.io.*;

public class flower{
  
  
   public static String canPlaceFlowers(int[] flowerbed, int n) {
        int i = 0, count = 0;
        while (i < flowerbed.length) {
            if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0) && (i == flowerbed.length - 1 || flowerbed[i + 1] == 0)) {
                flowerbed[i++] = 1;
                count++;
            }
             if(count>=n)
                return "Yes";
            i++;
        }
        return "No";
    }
  public static void main(String args[]) throws IOException {
    
    //write your code here
    Scanner s = new Scanner(System.in);
    int t = s.nextInt();
    while(t-- > 0)
    {
      int n = s.nextInt();
      int k = s.nextInt();
      
      int a[] = new int[n];
      for(int i = 0; i < n; i++)
      a[i] = s.nextInt();
      
     
      System.out.println(canPlaceFlowers(a,k));
    }
    
  }
}
