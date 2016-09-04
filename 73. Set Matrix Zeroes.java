public class Solution {
    private int normalZero = Integer.MIN_VALUE + 10;
	private int specialZero = Integer.MAX_VALUE - 10;
    // 将第(i, j)行列位置的数设置为0
	// 如果数为0，则设置为Integer.MIN_VALUE， 否则设置为Integer.MAX_VALUE
	public void setRowCol(int[][] matrix, int i, int j, int m, int n) {
		for(int index = 0; index < n; index++){
			if(matrix[i][index] == 0 || matrix[i][index] == normalZero) {
				matrix[i][index] = normalZero;
			}
			else {
				matrix[i][index] = specialZero;
			}
		}
		for(int index = 0; index < m; index++){
			if(matrix[index][j] == 0 || matrix[index][j] == normalZero){
				matrix[index][j] = normalZero;
			}
			else {
				matrix[index][j] = specialZero;
			}
		}
	}

    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
		if(row == 0) {
			return;
		}
		int col = matrix[0].length;
		for(int i = 0; i < row; i++){
			for(int j = 0; j < col; j++){
				if(matrix[i][j] == 0 || matrix[i][j] == normalZero) {
					setRowCol(matrix, i, j, row, col);
				}
			}
		}
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++){
				if(matrix[i][j] == normalZero || matrix[i][j] == specialZero) {
					matrix[i][j] = 0;
				}
			}
		}
    }
}