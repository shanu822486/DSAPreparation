
//link to Question - https://leetcode.com/problems/xor-queries-of-a-subarray/


class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        
        for(int i = 1; i < arr.length; i++){
            arr[i] = arr[i] ^ arr[i - 1];
        }
         
        int n_row = queries.length;
        int n_col = 2;
        int res[] = new int[n_row];
        
        for(int i = 0; i < n_row; i++){
            
            
            if(queries[i][0] == 0)
            res[i] = arr[queries[i][1]];
            else
                res[i] = arr[queries[i][0] - 1] ^ arr[queries[i][1]];
            
        }
        
        return res;
    }
}
