public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        if(m == 0) {
            return false;
        }
        int i = 0;
        int j = matrix[0].length - 1;
        while(i < m && j >= 0) {
            if(matrix[i][j] < target) {
                i++;
            }
            else if(matrix[i][j] == target) {
                return true;
            }
            else {
                j--;
            }
        }
        return false;
    }
}