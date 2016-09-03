public class Solution {
    public void rotate(int[][] matrix) {
        int len = matrix.length;
		int temp;
		// 先沿着左上到右下的对角线做变换
		for(int i = 0; i < len; i++) {
			for(int j = i; j < len; j++) {
				temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
		// 然后沿着垂直中轴线做变换
		for(int i = 0; i < len; i++) {
			for(int j = 0; j < len / 2; j++) {
				temp = matrix[i][j];
				matrix[i][j] = matrix[i][len - 1 - j];
				matrix[i][len - 1 - j] = temp;
			}
		}
    }
}