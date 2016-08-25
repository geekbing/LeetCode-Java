public class Solution {
    public String addBinary(String a, String b) {
        int indexA = a.length() - 1;
		int indexB = b.length() - 1;
		
		int carry = 0;
		int now;
		String ans = "";
		while(indexA >= 0 || indexB >= 0)
		{
			if(indexA < 0)
			{
				now = (int)(b.charAt(indexB)) - (int)('0') + carry;
				if(now >= 2)
				{
					now -= 2;
					carry = 1;
				}
				else
				{
					carry = 0;
				}
				ans = now + ans;
				indexB--;
				continue;
			}
			if(indexB < 0)
			{
				now = (int)(a.charAt(indexA)) - (int)('0') + carry;
				if(now >= 2)
				{
					now -= 2;
					carry = 1;
				}
				else
				{
					carry = 0;
				}
				ans = now + ans;
				indexA--;
				continue;
			}
			now = (int)(a.charAt(indexA)) - (int)('0') + (int)(b.charAt(indexB)) - (int)('0') + carry;
			if(now >= 2)
			{
				now -= 2;
				carry = 1;
			}
			else
			{
				carry = 0;
			}
			ans = now + ans;
			indexA--;
			indexB--;
		}		
		if(carry == 1)
		{
			ans = "1" + ans;
		}
		return ans;		
    }
}