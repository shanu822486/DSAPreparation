//not working

import java.util.*;
import java.io.*;

public class minchange{
  public static void main(String args[]) throws IOException {
    
    //write your code here
    Scanner s = new Scanner (System.in);
    int t = s.nextInt();
    s.nextLine();
    while(t-- > 0)
    {
      String a = s.nextLine() ;
      String b = s.nextLine();
      
      int count1 = 0;
      int count2 = 0;
      
      int min = 0;
      if(a.length() >= b.length())
      {
        for(int i = 0; i < b.length(); i++)
        {
          if(a.charAt(i) <= b.charAt(i))
          count1++;
        }
      }
      
      if(a.length() <= b.length())
      {
        for(int i = 0; i < a.length(); i++)
        {
          if(a.charAt(i) >= b.charAt(i))
          count2++;
        }
      }
      
      int arr[] = new int[26];
      int brr[] = new int[26];
      for(int i = 0; i < 26;i++)
      {
        arr[i] = 0;
        brr[i] = 0;
      }
      
      
      int max1 = 0;
      int max2 = 0;
      for(int i = 0; i < a.length(); i++)
      {
		int x = a.charAt(i) - 'a';
        arr[x]++;
        max1 = max1 > arr[x] ? max1 : arr[x];
      }
      max1 = a.length() - max1;
      for(int i = 0; i < b.length(); i++)
      {
		int x = b.charAt(i) - 'a';
        brr[x]++;
        max2 = max2 > brr[x] ? max2 : brr[x];
      }
      max2 = b.length() - max2;
      
      max1 = max1 + max2;
      min = count1 < count2 ? (count1 < max1 ? count1 : max1) : (count2 < max1? count2 : max1);
      System.out.println(min);
      
      
    }
    
  }
}
