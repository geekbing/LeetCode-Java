public class Solution {
    public int maxSubArray(int[] nums) {
        int len = nums.length;
        if(len == 1) {
            return nums[0];
        }
        int preMax = nums[0];
        int nowMax;
        int ans = nums[0];
        for(int i = 1; i < len; i++) {
            nowMax = Math.max(nums[i], preMax + nums[i]);
            if(nowMax > ans) {
                ans = nowMax;
            }
            
            preMax = nowMax;
        }
        return ans;
    }
}