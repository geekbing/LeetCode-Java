public class Solution {
    // 根据第n个数生成第n + 1个数
    public String generate(String s)
	{
		int len = s.length();
		String ans = "";
		int count;
		char now;
		int index;
		for(int i = 0; i < len; i++)
		{
			now = s.charAt(i);
			count = 0;
			index = i;
			while(index < len)
			{
				if(now == s.charAt(index))
				{
					count++;
					index++;
				}
				else
				{
					break;
				}
			}
			ans = ans + count + now;
			i = index - 1;
		}
		return ans;
	}

    public String countAndSay(int n) {
        if(n <= 0)
    	{
    		return "";
    	}
    	String ans = "1";
    	for(int i = 2; i <= n; i++)
    	{
    		ans = generate(ans);
    	}
        return ans;
    }
}