public class Solution {
    // 验证数组是否1-9最多出现一次
    public boolean isLineValid(char[] line)
	{
		int[] arr = new int[10];
		for(int i = 0, len = line.length; i < len; i++)
		{
		    if(line[i] != '.')
		    {
		        arr[line[i] - '0'] += 1;     
		    }
		}
		for(int i = 1; i <= 9; i++)
		{
			if(arr[i] > 1)
			{
				return false;
			}
		}
		return true;
	}
	
	// 验证棋盘的行
	public boolean isRowValid(char[][] board)
	{
		for(int i = 0; i< 9;i++)
		{
			if(!isLineValid(board[i]))
			{
				return false;
			}
		}
		return true;
	}
	// 验证棋盘的列
	public boolean isColValid(char[][] board)
	{
		int index;
		char[] col = new char[9];
		for(int i = 0; i < 9; i++)
		{
			index = 0;
			for(int j = 0; j < 9; j++)
			{
				col[index++] = board[j][i];
			}
			if(!isLineValid(col))
			{
				return false;
			}
		}
		return true;
	}
	// 验证棋盘的9个小宫格
	public boolean isMatrixValid(char[][] board)
	{
		char[] col = new char[9];
		int index;
		for(int i = 1; i <= 3; i++)
		{
			for(int j = 1; j <= 3; j++)
			{
				index = 0;
				for(int start = (i - 1) * 3, end = i * 3, m = start; m < end; m++)
				{
					for(int start2 = (j - 1) * 3, end2 = j * 3, n = start2; n < end2; n++)
					{
						col[index++] = board[m][n];
					}
				}
				if(!isLineValid(col))
				{
					return false;
				}
			}
		}
		return true;
	}
	
    public boolean isValidSudoku(char[][] board) {
        if(isRowValid(board) && isColValid(board) && isMatrixValid(board))
		{
			return true;
		}
		return false;
    }
}