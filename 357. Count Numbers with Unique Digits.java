public class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if(n == 0)
        {
            return 1;
        }
        if(n == 1)
    	{
    		return 10;
    	}
    	int ans = 10;
    	int base = 9;
    	int temp = 9;
    	while(n >= 2)
    	{
    		
    		temp *= base;
    		ans += temp;
    		n--;
    		base--;
    	}
    	return ans;
    }
}