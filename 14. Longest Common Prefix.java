public class Solution {
    public String longestCommonPrefix(String[] strs) {
        int len = strs.length;
		if(len == 0)
		{
			return "";
		}
		String ans = strs[0];
		String now;
		for(int i = 1; i < len; i++)
		{
			now = strs[i];
			while(ans.length() > 0)
			{
				if(!now.startsWith(ans))
				{
					ans = ans.substring(0, ans.length() - 1);
					if(ans.isEmpty())
					{
						return "";
					}
				}
				else
				{
					break;
				}
			}
		}
		return ans;
    }
}