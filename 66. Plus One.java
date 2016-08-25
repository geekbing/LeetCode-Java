public class Solution {
    public int[] plusOne(int[] digits) {
        int num = 0;
        int carry = 1;
        int[] ans = new int[digits.length];
        for(int len = digits.length, i = len - 1; i >= 0; i--)
        {
            num = digits[i] + carry;
            if(num >= 10)
            {
                num = num - 10;
                carry = 1;
            }
            else
            {
                carry = 0;
            }
            ans[i] = num;
        }
        if(carry == 1)
        {
             int[] temp = ans;
             ans = new int[digits.length + 1];
             for(int i = digits.length; i >= 1; i--)
             {
                 ans[i] = temp[i - 1];
             }
             ans[0] = 1;
        }
        return ans;
    }
}