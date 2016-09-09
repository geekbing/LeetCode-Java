public class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<String>();
		Set<String> skip = new HashSet<>(Arrays.asList("..",".",""));
		String[] arr = path.split("/");
		for(String item : arr){
			if(item.equals("..") && !stack.empty()){
				stack.pop();
			}
			else if(!skip.contains(item)){
				stack.push(item);
			}
		}
		if(stack.empty()){
			return "/";
		}
		String ans = stack.pop();
		while(!stack.empty()){
			ans = stack.pop() + "/" + ans;
		}
		return "/" + ans;
    }
}