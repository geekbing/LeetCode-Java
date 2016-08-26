public class Solution {
    public int[] countBits(int num) {
        if(num == 0)
        {
        	return new int[]{0};
        }
        if(num == 1)
        {
        	return new int[]{0, 1};
        }
        int[] ans = new int[num + 1];
        ans[0] = 0;
        ans[1] = 1;
        for(int i = 2; i <= num; i++)
        {
        	ans[i] = ans[i >> 1] + (i & 1);
        }
        return ans;
    }
}