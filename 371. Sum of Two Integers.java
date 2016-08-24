public class Solution {
    public int getSum(int a, int b) {
        int remainA = a;
        int remainB = b;
        
        int bit;
        int carry = 0;
        int base = 1;
        int ans = 0;
        
        while(remainA != 0 || remainB != 0)
        {
            bit = (remainA & 1) + (remainB & 1) + carry;
            if(bit >= 2)
            {
            	bit -= 2;
            	carry = 1;
            }
            else
            {            	
            	carry = 0;
            }
            ans = ans + base * bit;
            
            remainA = remainA >>> 1;
            remainB = remainB >>> 1;
            base *= 2;
        }
        if(carry == 1)
        {
            ans += base;
        }
        return ans;

    }
}