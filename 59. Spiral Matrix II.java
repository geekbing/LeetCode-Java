public class Solution {
    public int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];
    	int top = 0;
    	int right = n - 1;
    	int down = n - 1;
    	int left = 0;
    	
    	int total = n * n;
    	int count = 0;
    	int index = 0;
    	while(count < total) {
    		index = left;
    		// 上面
    		while(count < total && index <= right) {
    			ans[top][index++] = count + 1;
    			count++;
    		}
    		// 右边
    		index = ++top;
    		while(count < total && index <= down) {
    			ans[index++][right] = count + 1;
    			count++;
    		}
    		// 下面
    		index = --right;
    		while(count < total && index >= left) {
    			ans[down][index--] = count + 1;
    			count++;
    		}
    		// 左边
    		index = --down;
    		while(count < total && index >= top) {
    			ans[index--][left] = count + 1;
    			count++;
    		}
    		left++;
    	}
    	return ans;
    }
}