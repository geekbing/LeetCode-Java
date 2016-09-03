// 方法一
public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
		int col = matrix[0].length;
		// 先使用二分查找确定行
		int left = 0;
		int right = row - 1;
		int mid = left + (right - left) / 2;
		int line;
		while(right - left > 1) {
			if(matrix[mid][0] < target) {
				left = mid;
			}
			else if(matrix[mid][0] == target) {
				return true;
			}
			else {
				right = mid;
			}
			mid = left + (right - left) / 2;
		}
		if(matrix[left][0] == target || matrix[right][0] == target) {
			return true;
		}
		
		// 先使用二分查找法对行进行搜索
		if(matrix[right][0] < target) {
		    line = right;
		}
		else {
		    line = left;    
		}
		left = 0;
		right = col - 1;
		mid = left + (right - left) / 2;
		while(right - left > 1) {
			if(matrix[line][mid] < target) {
				left = mid;
			}
			else if(matrix[line][mid] == target) {
				return true;
			}
			else {
				right = mid;
			}
			mid = left + (right - left) / 2;
		}
		if(matrix[line][left] == target || matrix[line][right] == target) {
			return true;
		}
		return false;
    }
}

// 方法二
public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
		int n = matrix[0].length;
		// 先使用二分查找确定行
		int left = 0;
		int right = m * n - 1;
		int mid = left + (right - left) / 2;
		int row, col;
		while(right - left > 1) {
			row = mid / n;
			col = mid - row * n;
			if(matrix[row][col] < target) {
				left = mid;
			}
			else if(matrix[row][col] == target) {
				return true;
			}
			else {
				right = mid;
			}
			mid = left + (right - left) / 2;
		}
		row = left / n;
		col = left - row * n;
		if(matrix[row][col] == target) {
		    return true;
		}
		row = right / n;
		col = right - row * n;
		return matrix[row][col] == target;
    }
}
// 方法三
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