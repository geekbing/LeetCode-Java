public class Solution {
    // 20: dead -> dead
	// 21: dead -> live
	// 22: live -> dead
	// 23: live -> live

    // 检查一个cell周围活cell的个数
    public int numOfLive(int[][] board, int i, int j, int row, int col){
		int left = (j == 0) ? 0 : (j - 1);
		int right = (j == col - 1) ? (col - 1) : (j + 1);
		int top = (i == 0) ? 0 : (i - 1);
		int down = (i == row - 1) ? (row - 1) : (i + 1);
		
		int count = 0;
		for(int m = top; m <= down; m++) {
			for(int n = left; n <= right; n++) {
				if(board[m][n] == 1 || board[m][n] == 22 || board[m][n] == 23) {
					count++;
				}
			}
		}
		return count - (((board[i][j] == 1 || board[i][j] == 22 || board[i][j] == 23)) ? 1 : 0) ;
	}

    public void gameOfLife(int[][] board) {
        int row = board.length;
		int col = board[0].length;
		for(int i = 0; i < row; i++){
			for(int j = 0; j < col; j++){
				int num = numOfLive(board, i, j, row, col);
				// 如果当前的细胞是活的，按照规则进行赋值
				if(board[i][j] == 1) {
					if(num < 2 || num > 3) {
						board[i][j] = 22;
					}
					else if(num == 2 || num == 3) {
						board[i][j] = 23;
					}
				}
				else {
					if(num == 3){
						board[i][j] = 21;
					}
				}
			}
		}
		
		// 重新转换一下
		for(int i = 0; i < row; i++){
			for(int j = 0; j < col; j++){
				if(board[i][j] % 2 == 1){
					board[i][j] = 1;
				}
				else {
					board[i][j] = 0;
				}
			}
		}
    }
}