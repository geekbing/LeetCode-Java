public class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0)
        {
            return false; 
        }
        int num = x;
        int reveseNum = 0;
        int last;
        int now;
        while(x != 0)
        {
            last = x % 10;
            now = reveseNum;
            reveseNum = reveseNum * 10 + last;
            // 溢出检测
            if((reveseNum - last) / 10 != now)
            {
                return false;
            }
            x /= 10;
        }
        if(reveseNum == num)
        {
            return true;
        }
        return false;
    }
}