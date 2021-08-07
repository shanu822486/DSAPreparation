import java.util.*;
import java.io.*;

public class Decode{
  
 static int countDecodingDP(char digits[],
                           int n)
{
    // A table to store results of subproblems
    int count[] = new int[n + 1];
    count[0] = 1;
    count[1] = 1;
    if(digits[0]=='0')   //for base condition "01123" should return 0
          return 0;
    for (int i = 2; i <= n; i++)
    {
        count[i] = 0;
 
        // If the last digit is not 0,
        // then last digit must add to
        // the number of words
        if (digits[i - 1] > '0')
            count[i] = count[i - 1];
 
        // If second last digit is smaller
        // than 2 and last digit is smaller
        // than 7, then last two digits
        // form a valid character
        if (digits[i - 2] == '1' ||
           (digits[i - 2] == '2' &&
            digits[i - 1] < '7'))
            count[i] += count[i - 2];
    }
    return count[n];
}
  
  public static void main(String args[]) throws IOException {
    
    //write your code here
    Scanner s = new Scanner(System.in);
    int t = s.nextInt();
    s.nextLine();
    while(t-- > 0)
    {
		
      String str = s.nextLine();
      char arr[] = new char[str.length()];
      for(int i = 0; i < str.length(); i++)
      arr[i] = str.charAt(i);
      
      System.out.println(countDecodingDP(arr,str.length()));
    }
    
  }
}
