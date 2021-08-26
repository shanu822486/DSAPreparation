
// link to Question - https://www.codingninjas.com/codestudio/problems/second-largest-element-in-the-array_873375?leftPanelTab=0

public class Solution {
	public static int findSecondLargest(int n, int[] arr) {
		// Write your code here.
        if(n < 2)
            return -1;
        
        int first = arr[0];
        int second = Integer.MIN_VALUE;
        
        for(int i = 1; i < n; i++){
            if(first < arr[i]){
                second = first;
                first = arr[i];
            }
                
            else if(first > arr[i] && second < arr[i])
                second = arr[i];
        }
        if(second == Integer.MIN_VALUE)
            return -1;
        
        return second;
        
	}
}
