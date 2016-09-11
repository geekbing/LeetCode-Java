public class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<Integer>();
		int first, second;
		for(String item : tokens){
			if(item.equals("+")){
				if(!stack.empty()){
					second = stack.pop();
					first = stack.pop();
					stack.push(first + second);
				}
			}
			else if(item.equals("-")){
				second = stack.pop();
				first = stack.pop();
				stack.push(first - second);
			}
			else if(item.equals("*")){
				second = stack.pop();
				first = stack.pop();
				stack.push(first * second);
			}
			else if(item.equals("/")){
				second = stack.pop();
				first = stack.pop();
				stack.push(first / second);
			}
			else{
				stack.push(Integer.parseInt(item));
			}
		}
		return stack.pop();
    }
}