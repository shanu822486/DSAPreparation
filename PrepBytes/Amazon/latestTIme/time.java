import java.util.*;
import java.io.*;

public class time{
  public static void main(String args[]) throws IOException {
    
    //write your code here
    Scanner s = new Scanner(System.in);
    int t = s.nextInt();
    s.nextLine();
    while(t-- > 0)
    {
      String a = s.nextLine();
      
      char b[] = new char[5];
      StringBuffer sb = new StringBuffer();
      if(a.charAt(0) == '?' && a.charAt(1) == '?')
      {
        b[0] = '2';
        b[1] = '3';
      }
      
      else if(a.charAt(0) == '?' && a.charAt(1) - '0' <= 3)
      {
        b[0] = '2';
        b[1] = a.charAt(1);
      }
      else if(a.charAt(0) == '?' && a.charAt(1) - '0' > 3)
      {
        b[0] = '1';
        b[1] = a.charAt(1);
      }
      
      else if(a.charAt(1) == '?' && a.charAt(0) == '1')
      {
        b[1] = '9';
        b[0] = '1';
      }
      else if(a.charAt(1) == '?' && a.charAt(0) == '2')
      {
        b[1] = '3';
        b[0] = '2';
      }
      
      b[2] = ':';
      if(a.charAt(3) == '?' )
      
      b[3] = '5';
      else
      b[3] = a.charAt(3);
      if(a.charAt(4) == '?')
      b[4] = '9';
      else
      b[4] = a.charAt(4);
      
      for(int i = 0; i < 5; i++)
      sb.append(b[i]);
      
      System.out.println(sb.toString());
    }
    
  }
}
