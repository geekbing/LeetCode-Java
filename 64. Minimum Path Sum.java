public class Solution {
    public int minPathSum(int[][] grid) {
        int row = grid.length;
		int col = grid[0].length;
		int[][] ans = new int[row][col];
		ans[0][0] = grid[0][0];
		
		for(int i = 1; i < row; i++)
		{
			ans[i][0] = ans[i - 1][0] + grid[i][0];
		}
		for(int i = 1; i < col; i++)
		{
			ans[0][i] = ans[0][i - 1] + grid[0][i];
		}
		for(int i = 1; i < row; i++)
		{
			for(int j = 1; j < col; j++)
			{
				ans[i][j] = Math.min(ans[i - 1][j], ans[i][j - 1]) + grid[i][j];
			}
		}
		return ans[row - 1][col - 1];
    }
}