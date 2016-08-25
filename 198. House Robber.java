public class Solution {
    public int rob(int[] nums) {
        int len = nums.length;
        if(len == 0)
        {
            return 0;
        }
        if(len == 1)
        {
            return nums[0];
        }
        // 前天的获利
        int beforeProfit = nums[0];
        // 昨天的获利
        int preProfit = Math.max(nums[0], nums[1]);
        // 今天的获利
        int nowProfit;
        
        int ans = preProfit;
        for(int i = 2; i < len; i++)
        {
            // 计算今天的获利
            nowProfit = Math.max(beforeProfit + nums[i], preProfit);
            if(nowProfit > ans)
            {
                ans = nowProfit;
            }
            // 开始下一轮
            beforeProfit = preProfit;
            preProfit = nowProfit;
        }
        return ans;
    }
}