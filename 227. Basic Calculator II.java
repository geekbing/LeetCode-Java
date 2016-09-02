public class Solution {
    public int calculate(String s) {
        String str = s.trim().replaceAll(" +", "");
        int len = str.length();
        int res = 0, pre = 0, cur;
        char sign = '+';
        int i = 0;
        while(i < len) {
        	cur = 0;
        	while(i < len && '0' <= str.charAt(i) && str.charAt(i) <= '9') {
        		cur = cur * 10 + (str.charAt(i) - '0');
        		i++;
        	}
        	if(sign == '+') {
        		res += pre;
        		pre = cur;
        	}
        	else if(sign == '-') {
        		res += pre;
        		pre = -cur;
        	}
        	else if(sign == '*') {
        		pre *= cur;
        	}
        	else if(sign == '/'){
        		pre /= cur;
        	}
        	if(i < len) {
        		sign = str.charAt(i);
        		i++;
        	}
        }
        return res + pre;
    }
}