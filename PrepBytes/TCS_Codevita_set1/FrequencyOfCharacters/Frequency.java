import java.util.*;
import java.io.*;

public class Frequency {
  public static void main(String args[]) throws IOException {
    
    //write your code here
    BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
    String str = inp.readLine();
    
    int a[] = new int[26];
    for(int i = 0; i < 26; i++)
    {
      a[i] = 0;
    }
    int len = str.length();
    int count[] = new int[len];
    for(int i = 0; i < len; i++)
    {
      count[i] = a[str.charAt(i) - 'a'] + 1;
      a[str.charAt(i) - 'a'] = count[i];
    }
    
    
    int q = Integer.parseInt(inp.readLine());
    while(q-- > 0)
    {
      int x = Integer.parseInt(inp.readLine());
      
      System.out.println(count[x - 1] - 1);
      
    }
    
  }
}
