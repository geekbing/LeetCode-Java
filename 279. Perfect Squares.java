public class Solution {
    public int numSquares(int n) {
        int[] ans = new int[n + 1];
		Arrays.fill(ans, Integer.MAX_VALUE);
		for(int i = 0; i * i <= n; i++){
			ans[i * i] = 1;
		}
		
		// 从小到大寻找任意数
		for(int a = 0; a <= n; a++){
			for(int b = 0; a + b * b <= n; b++){
				ans[a + b * b] = Math.min(ans[a] + 1 , ans[a + b * b]);
			}
		}
        return ans[n];
    }
}