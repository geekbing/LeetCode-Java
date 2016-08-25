public class Solution {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        if(len < 2)
        {
            return 0;
        }
        
        // 卖掉上一天的股票的获利
        int preProfit = (prices[1] > prices[0]) ? (prices[1] - prices[0]) : 0;
        // 卖掉今天的股票的获利
        int nowProfit = 0;
        
        int ans = preProfit;
        for(int i = 2; i< len; i++)
        {
            // 计算卖掉今天股票的获利
            nowProfit = preProfit + prices[i] - prices[i - 1];
            if(nowProfit > 0)
            {
                if(nowProfit > ans)
                {
                    ans = nowProfit;
                }
                // 开始下一轮，今天的获利成为上一天的获利
                preProfit = nowProfit;
            }
            else
            {
                preProfit = 0;
            }
        }
        return ans;
    }
}