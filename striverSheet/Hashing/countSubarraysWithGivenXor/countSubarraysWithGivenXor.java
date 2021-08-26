
//link to Question - https://www.codingninjas.com/codestudio/problems/count-subarrays-with-given-xor_1115652?leftPanelTab=0

import java.util.ArrayList;
import java.util.HashMap;

public class Solution {
	public static int subarraysXor(ArrayList<Integer> arr, int x) {
		// Write your code here.
        HashMap<Integer, Integer> h = new HashMap<>();
        
        int count = 0;
        int xor = 0;
        
        for(int i : arr){
            xor = xor ^ i;
            
            if(xor == x)
                count++;
            
            //  y ^ xor == x ===>  y = xor ^ x;
            // we will find number of time y occur to get the count of subarrays having x as XOR
            
            if(h.containsKey(xor ^ x))
                count += h.get(xor ^ x);
            
            h.put(xor, h.getOrDefault(xor,0) + 1);
        }
        return count;
	}
}
