public class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1)
        {
            return s;
        }
        String[] matrix = new String[numRows];
		for(int i = 0; i < numRows; i++)
		{
			matrix[i] = "";
		}
		int count;
		for(int i = 0, len = s.length(); i < len;)
		{
			count = 0;
			// 向下
			while(count < numRows && i < len)
			{
				matrix[count] += s.charAt(i++);
				count++;
			}
			// 向上
			count = numRows - 2;
			while(count >= 1 && i < len)
			{
				matrix[count] += s.charAt(i++);
				count--;
			}
		}
		String ans = "";
		for(count = 0; count < numRows; count++)
		{
			ans += matrix[count];
		}
		return ans;
    }
}