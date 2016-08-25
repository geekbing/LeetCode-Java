public class Solution {
    public int reverse(int x) {
        if(x == 0)
        {
            return 0;
        }
        boolean flag = true;
        if(x < 0)
        {
            flag = false;
            x = -x;
        }
        int last;
        int ans = 0;
        int past;
        while(x != 0)
        {
        	last = x % 10;
        	past = ans;
        	ans = ans * 10 + last;
        	// 溢出检测
        	if((ans - last) / 10 != past)
        	{
        		return 0;
        	}
        	x /= 10;
        }
        return flag ? ans : -ans;
    }
}