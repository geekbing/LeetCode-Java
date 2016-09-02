public class Solution {
    public int calculate(String s) {
        s = s.trim().replaceAll(" +", "");
		int len = s.length();
		Stack<Integer> stack = new Stack<Integer>();
		int curVal = 0;
		int sign = 1;
		int result = 0;
		char now;
		for(int i = 0; i < len; i++) {
			now = s.charAt(i);
			if('0' <= now && now <= '9') {
				curVal = s.charAt(i) - '0';
				while(i + 1 < len && '0' <= s.charAt(i + 1) && s.charAt(i + 1) <= '9') {
					curVal = curVal * 10 + (s.charAt(i + 1) - '0');
					i++;
				}
				result += curVal * sign;
			}
			else if(now == '+') {
				sign = 1;
			}
			else if(now == '-') {
				sign = -1;
			}
			else if(now == '(') {
				stack.push(result);
				stack.push(sign);
				result = 0;
				sign = 1;
			}
			else if(now == ')') {
				result = result * stack.pop() + stack.pop();
			}
		}
		return result;
    }
}