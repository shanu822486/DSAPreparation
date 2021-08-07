
//link to question - https://leetcode.com/problems/search-a-2d-matrix/


class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int n_row = matrix.length;
        int n_col = matrix[0].length;
        
        int i = 0, j = n_col - 1;
        
        while(i < n_row && j >= 0){
            
            if(matrix[i][j] == target)
            {
                return true;
            }
            
            if(matrix[i][j] < target)
                i++;
            else
                j--;
                
            
        }
        
        return false;
        
    }
}
