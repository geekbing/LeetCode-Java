public class Solution {
    public String decodeString(String s) {
        Stack<String> stack = new Stack<String>();
        String temp, topStr, ans = "";
        int repeatNum, len = s.length(), i = 0;
        while(i < len) {
        	// 如果是数字
        	if(i < len && '0' <= s.charAt(i) && s.charAt(i) <= '9') {
        		temp = "";
        		while(i < len && '0' <= s.charAt(i) && s.charAt(i) <= '9') {
        			temp  += s.charAt(i);
        			i++;
        		}
        		stack.push(temp);
        	}
        	// 如果是字母
        	else if(i < len && 'a' <= s.charAt(i) && s.charAt(i) <= 'z') {
        		temp = "";
        		while(i < len && 'a' <= s.charAt(i) && s.charAt(i) <= 'z') {
        			temp  += s.charAt(i);
        			i++;
        		}
        		// 如果栈顶元素是字符串
        		if(!stack.empty() && 'a' <= stack.peek().charAt(0) && stack.peek().charAt(0) <= 'z') {
        			stack.push(stack.pop() + temp);
        		}
        		else{
        			stack.push(temp);
        		}
        	}
        	else if(i < len && s.charAt(i) == '[') {
        		stack.push("[");
        		i++;
        	}
        	else if(i < len && s.charAt(i) == ']') {
        		topStr = stack.pop();
        		stack.pop();
        		repeatNum = Integer.parseInt(stack.pop());
        		temp = "";
        		while(repeatNum >= 1) {
        			temp += topStr;
        			repeatNum--;
        		}
        		// 如果栈顶元素是字符串
        		if(!stack.empty() && 'a' <= stack.peek().charAt(0) && stack.peek().charAt(0) <= 'z') {
        			stack.push(stack.pop() + temp);
        		}
        		else{
        			stack.push(temp);
        		}
        		i++;
        	}
        }
        // 遍历栈
        while(!stack.empty()) {
        	ans = stack.pop() + ans;
        }
		return ans;
    }
}