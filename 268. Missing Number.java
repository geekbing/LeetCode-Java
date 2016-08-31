public class Solution {
    public int missingNumber(int[] nums) {
        int ans = 0;
		int len = nums.length;
		for(int i = 0; i < len; i++)
		{
			ans += i;
			ans -= nums[i];
		}
		return ans + len;
    }
}