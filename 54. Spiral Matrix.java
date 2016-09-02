public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
		int down = matrix.length - 1;
		if (down == -1) {
			return ans;
		}
		int right = matrix[0].length - 1;
		int top = 0, left = 0, count = 0;
		int total = (down + 1) * (right + 1);
		int index;
		while (count < total) {
			// 上面
			index = left;
			while (count < total && index <= right) {
				ans.add(matrix[top][index++]);
				count++;
			}
			// 右边
			index = ++top;
			while (count < total && index <= down) {
				ans.add(matrix[index++][right]);
				count++;
			}
			// 下面
			index = --right;
			while (count < total && index >= left) {
				ans.add(matrix[down][index--]);
				count++;
			}
			// 左边
			index = --down;
			while (count < total && index >= top) {
				ans.add(matrix[index--][left]);
				count++;
			}
			left++;
		}
		return ans;
    }
}