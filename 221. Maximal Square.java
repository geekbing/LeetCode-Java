public class Solution {
    public int maximalSquare(char[][] matrix) {
        if(matrix == null){
			return 0;
		}
		int row = matrix.length;
		if(row == 0){
			return 0;
		}
		int col = matrix[0].length;
		int ans = 0;
		int[][] arr = new int[row][col];
		for(int i = 0; i < row; i++){
			if(matrix[i][0] == '1'){
				arr[i][0] = 1;
				ans = 1;
			}
		}
		for(int j = 0; j < col; j++){
			if(matrix[0][j] == '1'){
				arr[0][j] = 1;
				ans = 1;
			}
		}
		for(int i = 1; i < row; i++){
			for(int j = 1; j < col; j++){
			    if(matrix[i][j] == '0'){
			        arr[i][j] = 0;   
			    }
			    else{
			        arr[i][j] = Math.min(Math.min(arr[i - 1][j - 1], arr[i - 1][j]), arr[i][j - 1]) + 1;    
			    }
				ans = (arr[i][j] > ans) ? arr[i][j] : ans;
			}
		}
		return ans * ans;
    }
}