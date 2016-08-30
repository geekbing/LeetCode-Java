public class Solution {
    public boolean isPalindrome(String s) {
        int l = 0;
		int r = s.length() - 1;
		char left, right;
		while(l < r)
		{
			left = s.charAt(l);
			right = s.charAt(r);
			if(!((left >= 'a' && left <= 'z') || (left >= 'A' && left <= 'Z') || (left >= '0' && left <= '9')))
			{
				l++;
				continue;
			}
			if(!((right >= 'a' && right <= 'z') || (right >= 'A' && right <= 'Z') ||  (right >= '0' && right <= '9')))
			{
				r--;
				continue;
			}
			if(Character.toLowerCase(left) != Character.toLowerCase(right))
			{
				return false;
			}
			l++;
			r--;
		}
		return true;
    }
}