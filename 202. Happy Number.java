public class Solution {
    // 根据规则求下一个数
    public int nextNum(int n) {
        int ans = 0;
        int last;
        while(n != 0)
        {
        	last = n % 10;
        	ans += last * last;
        	n = n / 10;
        }
        return ans;
    }
    public boolean isHappy(int n) {
        if(n == 1)
    	{
    		return true;
    	}
        HashSet<Integer> set = new HashSet<Integer>();
        set.add(n);
        int num;
        while(n != 1)
        {
        	num = nextNum(n);
        	if(set.contains(num))
        	{
        		return false;
        	}
        	else
        	{
        		set.add(num);
        		n = num;
        	}
        }
        return true;
    }
}