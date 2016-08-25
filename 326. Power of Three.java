public class Solution {
    public boolean isPowerOfThree(int n) {
        int maxPowerOfThree = 1162261467;
		if(n > 0 && maxPowerOfThree % n == 0)
		{
			return true;
		}
		return false;
    }
}