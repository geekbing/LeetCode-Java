public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int ans = 0;
        int base = 1;
        int last;
        int[] bits = new int[32];
        for(int i = 0; i < 32; i++)
        {
            last = n & 1;
            bits[i] = last;
            n = n >>> 1;
        }
        for(int i = 31; i >= 0; i--)
        {
        	ans += bits[i] * base;
        	base *= 2;
        }
        return ans;
    }
}