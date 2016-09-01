public class Solution {
    public int[] singleNumber(int[] nums) {
        int[] ans = {0, 0};
		int xorResult = 0;
		for(int num : nums) {
			xorResult ^= num;
		}
		// 找到最后一位为1
		xorResult &= -xorResult;
		for(int num : nums) {
			if((xorResult & num) == 0) {
				ans[0] ^= num;
			}
			else {
				ans[1] ^= num;
			}
		}
		return ans;
    }
}