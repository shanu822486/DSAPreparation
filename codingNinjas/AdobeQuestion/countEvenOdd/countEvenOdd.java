
// link to Question - https://www.codingninjas.com/codestudio/problems/count-even-odd_757508?topList=top-adobe-coding-interview-questions

import java.util.*;
public class Solution {
	public static int[] countEvenOdd(int[] arr, int n) {
		// Write your code here.
        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        
        for(int i = 0; i < n; i++){
            map.put(arr[i], map.getOrDefault(arr[i],0) + 1);
            set.add(arr[i]);
        }
        
        int a[] = new int[2];
        a[0] = 0;
        a[1] = 0;
        
        for(int i : set ){
            int count = map.get(i);
            if(count % 2 == 0)
                a[1]++;
            else
                a[0]++;
        }
        return a;
	}
}

