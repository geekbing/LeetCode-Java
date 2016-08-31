public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
		int[] ans = new int[len];
		ans[0] = 1;
		
		int left = 1, right = 1;
		for(int i = 1; i < len; i++)
		{
			left *= nums[i - 1];
			ans[i] = left;
		}	
		for(int i = len - 2; i >= 0; i--)
		{
			right *= nums[i + 1];
			ans[i] *= right;
		}
		return ans;
    }
}