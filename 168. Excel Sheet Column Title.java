public class Solution {
    public String convertToTitle(int n) {
        int last;
		String ans = "";
		while(n != 0)
		{
			n--;
			last = n % 26;
			ans = (char)('A' + last) + ans;
			n /= 26;
		}
		return ans;
    }
}