
// Link to Question - https://leetcode.com/problems/rotate-image/


class Solution {
    public void rotate(int[][] matrix) {
        
        int nRow = matrix.length;
        int nCol = matrix[0].length;
        
        //transpose of matrix
        for(int i = 0; i < nRow; i++){
            for(int j = i; j < nCol; j++){
                int t = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = t;
            }
        }
        
        // reverse the rows 
        
        for(int i = 0; i < nRow; i++){
            for(int j = 0; j < nCol / 2; j++){
                
                int t = matrix[i][j];
                matrix[i][j] = matrix[i][nCol -j - 1];
                matrix[i][nCol - 1 - j] = t;
            }
        }
        
        
    }
}
