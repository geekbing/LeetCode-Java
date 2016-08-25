public class Solution {
    public int lengthOfLastWord(String s) {
        int ans = 0;
		s = s.trim();
		int index = s.length() - 1;
		int indexChar;
		while(index >= 0)
		{
			indexChar = s.charAt(index);
			if((indexChar >= 'a' && indexChar <= 'z') || (indexChar >= 'A' && indexChar <= 'Z'))
			{
				ans++;
			}
			else if(indexChar == ' ' && ans > 0)
			{
				return ans;
			}
			else
			{
				return 0;
			}
			index--;
		}
		return ans;
    }
}