
//link to question - https://leetcode.com/problems/search-a-2d-matrix/


class Solution {
    public static boolean searchMatrix(int[][] matrix, int target) {

        int n_row = matrix.length;
        int n_col = matrix[0].length;

        int i = 0, j = n_col - 1;

        while (i < n_row && j >= 0) {

            if (matrix[i][j] == target) {
                return true;
            }
            if (matrix[i][j] < target)
                i++;
            else
                j--;
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 24, 60},
        };
        int target = 3;
        System.out.println(searchMatrix(matrix, target));
    }
}
