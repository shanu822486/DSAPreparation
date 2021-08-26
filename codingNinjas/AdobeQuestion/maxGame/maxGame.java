
// link to Question - https://www.codingninjas.com/codestudio/problems/max-game_794955?topList=top-adobe-coding-interview-questions&leftPanelTab=0

/*
    Time complexity: O(N * log(N))
    Space complexity: O(N)
    
    Where 'N' is the total numbers given initially.
*/

import java.util.PriorityQueue;

public class Solution {

    public static long minPenalty(int[] arr) {
        int n = arr.length;
        
        long penalty = 0;
        
        PriorityQueue<Long> pq = new PriorityQueue();
        
        for(int i = 0; i < n; i++){
            pq.add((long) arr[i]);
        }
        
        while(pq.size() != 1){
            
            long a = pq.poll();    
            long b = pq.poll();        
            
            penalty += (a + b);
            pq.add(a + b);
            
        }
        
        return penalty; 
    }
}
