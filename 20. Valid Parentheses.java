public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
    	char c;
    	Character top;
    	for(int i = 0, len = s.length(); i < len; i++)
    	{
    		c = s.charAt(i);
    		if(c == '[' || c == '(' || c == '{')
    		{
    			stack.push(c);
    		}
    		else
    		{
    			if(stack.empty())
    			{
    				return false;
    			}
    			top = stack.peek().charValue();
    			// 判断栈顶字符和字符串当前字符是否匹配
    			if((top == '[' && c == ']') || (top == '(' && c == ')') || (top == '{' && c == '}'))
        		{
        			stack.pop();
        		}
        		else
        		{
        		    return false;    
        		}
    		}
    	}
    	return stack.empty();
    }
}