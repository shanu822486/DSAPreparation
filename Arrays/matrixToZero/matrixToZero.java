import java.util.Arrays;
//link to Question - https://leetcode.com/problems/set-matrix-zeroes/

class Solution {
    public static void setZeroes(int[][] matrix) {
        int n_row = matrix.length;
        int n_col = matrix[0].length;

        boolean isCol = false; //for the first column

        for (int i = 0; i < n_row; i++) {

            if (matrix[i][0] == 0)
                isCol = true;

            for (int j = 1; j < n_col; j++) {

                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }


        for (int i = 1; i < n_row; i++) {
            for (int j = 1; j < n_col; j++)
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
        }


        //to set the first row to zero
        if (matrix[0][0] == 0) {
            for (int i = 0; i < n_col; i++)
                matrix[0][i] = 0;
        }

        //to make the first column zero

        if (isCol) {
            for (int j = 0; j < n_row; j++)
                matrix[j][0] = 0;
        }

    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}
        };
        setZeroes(matrix);
        for(int[] i : matrix)
            System.out.println(Arrays.toString(i));
    }
}
